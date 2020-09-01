package com.lfx.mall.marketing.web.config;

import com.lfx.demo.spring.annotation.EnableTrace;
import com.lfx.demo.spring.config.BeanPrintAutoConfig;
import com.lfx.demo.weblog.annotation.EnableWebAll;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.apache.dubbo.spring.boot.autoconfigure.DubboAutoConfiguration;
import org.apache.dubbo.spring.boot.autoconfigure.DubboRelaxedBinding2AutoConfiguration;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.HttpEncodingAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.ServletWebServerFactoryAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-05-22 15:10:36
 */
@ImportAutoConfiguration({
        BeanPrintAutoConfig.class,
        DubboRelaxedBinding2AutoConfiguration.class,
        DubboAutoConfiguration.class,
        DispatcherServletAutoConfiguration.class,
        ServletWebServerFactoryAutoConfiguration.class,
        HttpEncodingAutoConfiguration.class,
        WebMvcAutoConfiguration.class
})
@Configuration
@ComponentScan(value = "com.lfx.mall.marketing.web")
@EnableDubbo(scanBasePackages = {"com.lfx.mall.marketing.web"})
@EnableTrace
@EnableWebAll
@Slf4j
public class WebAutoConfiguration {

}
