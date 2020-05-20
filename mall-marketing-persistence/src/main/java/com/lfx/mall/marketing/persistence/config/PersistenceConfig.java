package com.lfx.mall.marketing.persistence.config;

import com.baomidou.mybatisplus.autoconfigure.MybatisPlusAutoConfiguration;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.lfx.mall.marketing.persistence.algorithm.hash.HashCodingHelper;
import com.lfx.mall.marketing.persistence.algorithm.hash.StringConsistentHashCoding;
import lombok.extern.slf4j.Slf4j;
import org.apache.shardingsphere.shardingjdbc.spring.boot.SpringBootConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-05-16 18:32:18
 */
@Configuration
@ImportAutoConfiguration({
        SpringBootConfiguration.class,
//        DataSourceAutoConfiguration.class,
        MybatisPlusAutoConfiguration.class
})
@MapperScan("com.lfx.mall.marketing.persistence.dao")
@Slf4j
public class PersistenceConfig {

    /**
     * 分页插件
     */
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }

    @Bean(name = "dbHashCoding")
    public StringConsistentHashCoding dbHashCoding(
            @Value("${sharing.db.node.num}") Integer realNodeCount,
            @Value("${sharing.db.virtual-node.num}") Integer virtualNodeCount
    ) {
        StringConsistentHashCoding dbHashCoding = new StringConsistentHashCoding(realNodeCount, virtualNodeCount);
        HashCodingHelper.setDbHashCoding(dbHashCoding);
        return dbHashCoding;
    }

    @Bean(name = "tableHashCoding")
    public StringConsistentHashCoding tableHashCoding(
            @Value("${sharing.table.node.num}") Integer realNodeCount,
            @Value("${sharing.table.virtual-node.num}") Integer virtualNodeCount
    ) {
        StringConsistentHashCoding dbHashCoding = new StringConsistentHashCoding(realNodeCount, virtualNodeCount);
        HashCodingHelper.setTableHashCoding(dbHashCoding);
        return dbHashCoding;
    }
}
