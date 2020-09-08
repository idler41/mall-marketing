package com.lfx.mall.marketing.mq;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
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
    protected static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    public static void initSysProperty() {
        System.setProperty("app.config.print.bean", "true");
        System.setProperty("app.config.print.bean-impl", "false");
        System.setProperty("server.port", "8339");
        System.setProperty("log.log-default-file", "CONSOLE_LOG");
    }

    public static <T> T readJsonFile(String fileName, Class<T> clazz) {
        String jsonContent = loadResource(fileName);
        try {
            return OBJECT_MAPPER.readValue(jsonContent, clazz);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public static <T> T readJsonFile(String fileName, TypeReference<T> jsonTypeReference) {
        String jsonContent = loadResource(fileName);
        try {
            return OBJECT_MAPPER.readValue(jsonContent, jsonTypeReference);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public String toJsonStr(Object val) {
        return toJsonStr(val, false);
    }

    public byte[] toBytes(Object val) {
        try {
            return OBJECT_MAPPER.writeValueAsBytes(val);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public String toJsonStr(Object val, boolean prettyFormat) {
        try {
            return prettyFormat ? OBJECT_MAPPER.writerWithDefaultPrettyPrinter().writeValueAsString(val) : OBJECT_MAPPER.writeValueAsString(val);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
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
