package com.lfx.mall.marketing.persistence.config;

import com.baomidou.mybatisplus.autoconfigure.MybatisPlusAutoConfiguration;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.lfx.mall.marketing.persistence.algorithm.hash.DatabaseShardHash;
import com.lfx.mall.marketing.persistence.algorithm.hash.ShardHashHelper;
import com.lfx.mall.marketing.persistence.algorithm.hash.StringConsistentHash;
import com.lfx.mall.marketing.persistence.algorithm.hash.TableShardHash;
import lombok.extern.slf4j.Slf4j;
import org.apache.shardingsphere.shardingjdbc.spring.boot.SpringBootConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.transaction.TransactionAutoConfiguration;
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
@ImportAutoConfiguration({
        SpringBootConfiguration.class,
//        DataSourceAutoConfiguration.class,
        DataSourceTransactionManagerAutoConfiguration.class,
        TransactionAutoConfiguration.class,
        MybatisPlusAutoConfiguration.class
})
@PropertySources({
        @PropertySource("classpath:/application.properties"),
        @PropertySource("classpath:/application-datasource.properties"),
        @PropertySource("classpath:/application-db.properties")
})
@MapperScan("com.lfx.mall.marketing.persistence.dao")
@ComponentScan(value = "com.lfx.mall.marketing.persistence")
@Configuration
@Slf4j
public class PersistenceAutoConfiguration {

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
