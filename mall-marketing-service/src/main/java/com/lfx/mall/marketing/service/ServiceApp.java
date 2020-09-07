package com.lfx.mall.marketing.service;

import com.lfx.mall.marketing.service.config.ServiceConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;

/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-05-17 10:32:07
 */
@Slf4j
public class ServiceApp {
    public static void main(String[] args) {
        // 建议启动时添加参数：-Ddubbo.application.logger=slf4j
        SpringApplication.run(ServiceConfig.class, args);
    }
}
