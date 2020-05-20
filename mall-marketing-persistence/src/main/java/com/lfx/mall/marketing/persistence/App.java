package com.lfx.mall.marketing.persistence;

import com.lfx.mall.marketing.common.constant.AppConstants;
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
        System.out.println(Integer.MAX_VALUE);
        ConfigurableApplicationContext ctx = SpringApplication.run(PersistenceConfig.class, args);
        printSpringBean(ctx);
        log.info("==========[微服务启动成功]==========");
    }

//    public static void main(String[] args) {
//        System.out.println("==========打印sharding配置信息==========");
//        int size = 4;
//        String tableName = "mall_promotion_activity";
//
//        System.out.println("spring.shardingsphere.datasource.names=ds$->{0..%size}".replaceFirst("%size", String.valueOf(size - 1)));
//        for (int i = 0; i < size; i++) {
//            String template = "spring.shardingsphere.datasource.ds%i.type= ${common.datasource.type}\n" +
//                    "spring.shardingsphere.datasource.ds%i.driver-class-name= ${common.datasource.driver-class-name}\n" +
//                    "spring.shardingsphere.datasource.ds%i.jdbcUrl=jdbc:mysql://${sharding.db%i.host}/%tableName%i?autoReconnect=true&tinyInt1isBit=false&useUnicode=true&useSSL=true\n" +
//                    "spring.shardingsphere.datasource.ds%i.username=${sharding.db%i.username}\n" +
//                    "spring.shardingsphere.datasource.ds%i.password=${sharding.db%i.password}\n" +
//                    "spring.shardingsphere.datasource.ds%i.pool-name=HikariPool-%i\n" +
//                    "spring.shardingsphere.datasource.ds%i.connection-test-query=${common.datasource.connection-test-query}\n" +
//                    "spring.shardingsphere.datasource.ds%i.maximum-pool-size=${common.datasource.maximum-pool-size}\n" +
//                    "spring.shardingsphere.datasource.ds%i.connection-timeout=${common.datasource.connection-timeout}";
//            template = template.replaceAll("%i", String.valueOf(i));
//            template = template.replaceAll("%tableName", tableName);
//            System.out.println(template);
//        }
//    }

    private static void printSpringBean(ConfigurableApplicationContext ctx) {
        if (Boolean.parseBoolean(ctx.getEnvironment().getProperty(AppConstants.Config.PRINT_BEAN_KEY))) {
            StringBuilder allBeanNameStr = new StringBuilder(500);
            allBeanNameStr.append("----------------- spring beans start -----------------")
                    .append(System.lineSeparator());
            String[] beanNames = ctx.getBeanDefinitionNames();
            allBeanNameStr.append("beans amount: ").append(beanNames.length)
                    .append(System.lineSeparator());
            Arrays.sort(beanNames);
            boolean printBeanImpl = Boolean.parseBoolean(ctx.getEnvironment().getProperty(AppConstants.Config.PRINT_BEAN_IMPL_KEY));
            for (String name : beanNames) {
                allBeanNameStr.append(name);
                if (printBeanImpl) {
                    allBeanNameStr.append("=").append(ctx.getBean(name));
                }
                allBeanNameStr.append(System.lineSeparator());
            }
            allBeanNameStr.append("----------------- spring beans end -----------------");
            log.info(allBeanNameStr.toString());
        }
    }
}
