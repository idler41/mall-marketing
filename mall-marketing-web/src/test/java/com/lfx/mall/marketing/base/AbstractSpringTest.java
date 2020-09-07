package com.lfx.mall.marketing.base;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lfx.mall.marketing.common.util.JacksonUtil;
import com.lfx.mall.marketing.web.config.WebConfig;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-05-18 16:19:15
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = WebConfig.class)
public class AbstractSpringTest {

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    public static void initSysProperty() {
        System.setProperty("apollo.configService", "http://10.0.46.45:8080");
        System.setProperty("dubbo.application.qosPort", "9003");
        System.setProperty("dubbo.protocol.port", "20800");
        System.setProperty("server.port", "8339");
        System.setProperty("log.log-default-file", "CONSOLE_LOG");
    }

    public String toJsonStr(Object val) {
        return toJsonStr(val, false);
    }

    public String toJsonStr(Object val, boolean prettyFormat) {
        try {
            return prettyFormat ? OBJECT_MAPPER.writerWithDefaultPrettyPrinter().writeValueAsString(val) : OBJECT_MAPPER.writeValueAsString(val);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public static <T> T readJsonFile(String fileName, Class<T> clazz) {
        String jsonContent = loadResource(fileName);
        return JacksonUtil.parseObject(jsonContent, clazz);
    }

    public static String loadResource(String resourceName) {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(Objects.requireNonNull(AbstractSpringTest.class.getClassLoader().getResourceAsStream(resourceName))));
            StringBuilder buffer = new StringBuilder();
            String line;
            while ((line = in.readLine()) != null) {
                buffer.append(line);
            }
            return buffer.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
