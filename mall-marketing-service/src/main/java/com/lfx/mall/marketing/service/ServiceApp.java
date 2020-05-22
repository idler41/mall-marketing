package com.lfx.mall.marketing.service;

import com.lfx.mall.marketing.common.constant.AppConstants;
import com.lfx.mall.marketing.common.util.AppUtil;
import com.lfx.mall.marketing.service.config.ServiceConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-05-17 10:32:07
 */
@Slf4j
public class ServiceApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(ServiceConfig.class, args);

        if (Boolean.parseBoolean(ctx.getEnvironment().getProperty(AppConstants.Config.PRINT_BEAN_KEY))) {
            log.info(AppUtil.getAllSpringBeanStr(ctx));
        }

        log.info("==========[微服务启动成功]==========");
    }
}
