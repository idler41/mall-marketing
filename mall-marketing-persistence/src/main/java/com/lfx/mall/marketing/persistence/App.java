package com.lfx.mall.marketing.persistence;

import com.lfx.mall.marketing.persistence.config.PersistenceConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-05-17 10:32:07
 */
@Slf4j
public class App {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(PersistenceConfig.class, args);
        printSpringBean(ctx);
        log.info("==========[微服务启动成功]==========");
    }

    private static void printSpringBean(ConfigurableApplicationContext ctx) {
        if (Boolean.parseBoolean(ctx.getEnvironment().getProperty("print.bean.enable"))) {
            StringBuilder allBeanNameStr = new StringBuilder(500);
            allBeanNameStr.append("----------------- spring beans start -----------------")
                    .append(System.lineSeparator());
            String[] beanNames = ctx.getBeanDefinitionNames();
            allBeanNameStr.append("beans amount: ").append(beanNames.length)
                    .append(System.lineSeparator());
            Arrays.sort(beanNames);
            for (String name : beanNames) {
                allBeanNameStr.append(name);
                if (Boolean.parseBoolean(ctx.getEnvironment().getProperty("print.bean.impl.enable"))) {
                    allBeanNameStr.append("=").append(ctx.getBean(name));
                }
                allBeanNameStr.append(System.lineSeparator());
            }
            allBeanNameStr.append("----------------- spring beans end -----------------");
            log.info(allBeanNameStr.toString());
        }
    }
}
