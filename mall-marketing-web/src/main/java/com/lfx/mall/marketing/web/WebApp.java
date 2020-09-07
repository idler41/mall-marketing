package com.lfx.mall.marketing.web;

import com.lfx.mall.marketing.web.config.WebConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;

/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-05-17 10:32:07
 */
@Slf4j
public class WebApp {
    public static void main(String[] args) {
        // 建议启动时添加参数：-Ddubbo.application.logger=slf4j
        SpringApplication.run(WebConfig.class, args);
    }
}
