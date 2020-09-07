package com.lfx.mall.marketing.mq.config;

import com.lfx.demo.mq.config.ONSAutoConfig;
import com.lfx.demo.spring.config.BeanPrintAutoConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-09-07 16:42:11
 */
@ImportAutoConfiguration({
        BeanPrintAutoConfig.class,
        ONSAutoConfig.class
})
@ComponentScan(value = "com.lfx.mall.marketing.mq")
@Configuration
@Slf4j
public class MQConfig {
}
