package com.lfx.mall.marketing.web;

import com.lfx.mall.marketing.web.config.WebAutoConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;

/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-05-17 10:32:07
 */
@Slf4j
public class WebApp {
    public static void main(String[] args) {
        SpringApplication.run(WebAutoConfiguration.class, args);
    }
}
