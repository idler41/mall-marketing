package com.lfx.mall.marketing.persistence;

import com.lfx.mall.marketing.common.constant.AppConstants;
import com.lfx.mall.marketing.common.util.AppUtil;
import com.lfx.mall.marketing.persistence.config.PersistenceConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-05-17 10:32:07
 */
@Slf4j
public class App {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(PersistenceConfig.class, args);

        if (Boolean.parseBoolean(ctx.getEnvironment().getProperty(AppConstants.Config.PRINT_BEAN_KEY))) {
            log.info(AppUtil.getAllSpringBeanStr(ctx));
        }

        log.info("==========[微服务启动成功]==========");
    }

    public static void printBuildSql() {
        System.out.println("==========打印sharding配置信息==========");
        int size = 4;
        String tableName = "mall_promotion_activity";

        System.out.println("spring.shardingsphere.datasource.names=ds$->{0..%size}".replaceFirst("%size", String.valueOf(size - 1)));
        for (int i = 0; i < size; i++) {
            String template = "spring.shardingsphere.datasource.ds%i.type= ${common.datasource.type}\n" +
                    "spring.shardingsphere.datasource.ds%i.driver-class-name= ${common.datasource.driver-class-name}\n" +
                    "spring.shardingsphere.datasource.ds%i.jdbcUrl=jdbc:mysql://${sharding.db%i.host}/%tableName%i?autoReconnect=true&tinyInt1isBit=false&useUnicode=true&useSSL=true\n" +
                    "spring.shardingsphere.datasource.ds%i.username=${sharding.db%i.username}\n" +
                    "spring.shardingsphere.datasource.ds%i.password=${sharding.db%i.password}\n" +
                    "spring.shardingsphere.datasource.ds%i.pool-name=HikariPool-%i\n" +
                    "spring.shardingsphere.datasource.ds%i.connection-test-query=${common.datasource.connection-test-query}\n" +
                    "spring.shardingsphere.datasource.ds%i.maximum-pool-size=${common.datasource.maximum-pool-size}\n" +
                    "spring.shardingsphere.datasource.ds%i.connection-timeout=${common.datasource.connection-timeout}";
            template = template.replaceAll("%i", String.valueOf(i));
            template = template.replaceAll("%tableName", tableName);
            System.out.println(template);
        }
    }
}
