package com.lfx.mall.marketing.web.config;

import com.lfx.demo.spring.annotation.EnableTrace;
import com.lfx.demo.web.annotation.EnableWebAll;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-05-22 15:10:36
 */
@SpringBootApplication(scanBasePackages = "com.lfx.mall.marketing.web")
@EnableDubbo(scanBasePackages = {"com.lfx.mall.marketing.web"})
@EnableTrace
@EnableWebAll
@Slf4j
public class WebAutoConfiguration {

}
