package com.lfx.mall.marketing.service.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lfx.demo.spring.config.BeanPrintAutoConfig;
import com.lfx.mall.marketing.common.util.JacksonUtil;
import com.lfx.mall.marketing.persistence.config.PersistenceConfig;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.spring.boot.autoconfigure.DubboAutoConfiguration;
import org.apache.dubbo.spring.boot.autoconfigure.DubboRelaxedBinding2AutoConfiguration;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-05-20 17:31:24
 */
@ImportAutoConfiguration({
        BeanPrintAutoConfig.class,
        DubboRelaxedBinding2AutoConfiguration.class,
        DubboAutoConfiguration.class,
        PersistenceConfig.class
})
@ComponentScan(value = "com.lfx.mall.marketing.service")
@Configuration
@Slf4j
public class ServiceConfig {

    @Bean
    public ObjectMapper objectMapper() {
        return JacksonUtil.OBJECT_MAPPER;
    }
}
