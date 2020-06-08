package com.lfx.mall.marketing.common.util;

import com.lfx.mall.marketing.common.constant.AppConstants;
import lombok.experimental.UtilityClass;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-05-20 17:34:24
 */
@UtilityClass
public class AppUtil {

    public String getAllSpringBeanStr(ConfigurableApplicationContext ctx) {
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
        return allBeanNameStr.toString();
    }
}
