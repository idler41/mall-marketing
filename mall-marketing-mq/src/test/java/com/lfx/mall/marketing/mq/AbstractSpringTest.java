package com.lfx.mall.marketing.mq;

import com.lfx.mall.marketing.common.util.JacksonUtil;
import com.lfx.mall.marketing.mq.config.MQConfig;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-09-08 09:43:36
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MQConfig.class)
public class AbstractSpringTest {

    public static void initSysProperty() {
        System.setProperty("app.config.print.bean", "true");
        System.setProperty("app.config.print.bean-impl", "false");
        System.setProperty("server.port", "8339");
        System.setProperty("log.log-default-file", "CONSOLE_LOG");
    }

    public static <T> T readJsonFile(String fileName, Class<T> clazz) {
        String jsonContent = loadResource(fileName);
        return JacksonUtil.parseObject(jsonContent, clazz);
    }

    public static String loadResource(String resourceName) {
        StringBuilder buffer = new StringBuilder();
        try (BufferedReader in = new BufferedReader(new InputStreamReader(Objects.requireNonNull(AbstractSpringTest.class.getClassLoader().getResourceAsStream(resourceName))))) {
            String line;
            while ((line = in.readLine()) != null) {
                buffer.append(line);
            }
            return buffer.toString();
        } catch (IOException e) {
            return null;
        }
    }
}
