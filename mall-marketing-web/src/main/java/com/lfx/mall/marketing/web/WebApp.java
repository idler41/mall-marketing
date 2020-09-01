package com.lfx.mall.marketing.web;

import com.lfx.mall.marketing.web.config.WebAutoConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.spring.boot.context.event.WelcomeLogoApplicationListener;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationListener;

import java.util.Collection;
import java.util.stream.Collectors;

/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-05-17 10:32:07
 */
@Slf4j
public class WebApp {
    public static void main(String[] args) {
        // 建议启动时添加参数：-Ddubbo.application.logger=slf4j
        SpringApplication.run(WebAutoConfiguration.class, args);
    }
}
