package com.lfx.mall.marketing.persistence.config;

import com.baomidou.mybatisplus.autoconfigure.MybatisPlusPropertiesCustomizer;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.lfx.mall.marketing.persistence.algorithm.hash.DatabaseShardHash;
import com.lfx.mall.marketing.persistence.algorithm.hash.ShardHashHelper;
import com.lfx.mall.marketing.persistence.algorithm.hash.StringConsistentHash;
import com.lfx.mall.marketing.persistence.algorithm.hash.TableShardHash;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

/**
 * application.properties放到config目录是为了避免同名配置文件被覆盖(persistenceh和service层的同名文件: application.properties)
 * 使用@PropertySources是为了避免service层不能正常加载persistence层的配置文件
 *
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-05-16 18:32:18
 */
@MapperScan("com.lfx.mall.marketing.persistence.dao")
@ComponentScan("com.lfx.mall.marketing.persistence")
@Configuration
@PropertySources({
        @PropertySource("classpath:/application.properties"),
        @PropertySource("classpath:/application-datasource.properties"),
        @PropertySource("classpath:/application-db.properties")
})
@Slf4j
public class PersistenceAutoConfig {

    @Bean
    public MybatisPlusPropertiesCustomizer plusPropertiesCustomizer() {
        // mybatis-plus.global-config属性都使用的是硬编码的默认值，配置文件不起作用，官方推荐该方法修改属性
        return plusProperties -> plusProperties.getGlobalConfig().setBanner(false);
    }

    /**
     * 分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }

    @Bean(name = "dbHashCoding")
    public StringConsistentHash dbHashCoding(
            @Value("${sharing.db.node.num}") Integer realNodeCount,
            @Value("${sharing.db.virtual-node.num}") Integer virtualNodeCount
    ) {
        DatabaseShardHash dbHashCoding = new DatabaseShardHash(realNodeCount, virtualNodeCount);
        ShardHashHelper.databaseShardHash = dbHashCoding;
        return dbHashCoding;
    }

    @Bean(name = "tableHashCoding")
    public StringConsistentHash tableHashCoding(
            @Value("${sharing.table.node.num}") Integer realNodeCount,
            @Value("${sharing.table.virtual-node.num}") Integer virtualNodeCount
    ) {
        TableShardHash tableShardHash = new TableShardHash(realNodeCount, virtualNodeCount);
        ShardHashHelper.tableShardHash = tableShardHash;
        return tableShardHash;
    }
}
