package com.lfx.mall.marketing.mq;

import com.lfx.mall.marketing.mq.config.MQConfig;
import org.springframework.boot.SpringApplication;

/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-09-07 16:41:50
 */
public class MQApp {
    public static void main(String[] args) {
        SpringApplication.run(MQConfig.class, args);
    }
}
