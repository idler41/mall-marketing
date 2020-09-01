package com.lfx.mall.marketing.service.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lfx.mall.marketing.common.util.JacksonUtil;
import com.lfx.mall.marketing.persistence.config.PersistenceAutoConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-05-20 17:31:24
 */
@SpringBootApplication(scanBasePackages = "com.lfx.mall.marketing.service")
@Slf4j
public class ServiceAutoConfiguration {

    @Bean
    public ObjectMapper objectMapper() {
        return JacksonUtil.OBJECT_MAPPER;
    }
}
