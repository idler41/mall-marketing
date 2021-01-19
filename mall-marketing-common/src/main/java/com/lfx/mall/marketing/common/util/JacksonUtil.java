package com.lfx.mall.marketing.common.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.text.SimpleDateFormat;
import java.util.List;

/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-05-21 14:39:16
 */
public class JacksonUtil {

    public static final ObjectMapper OBJECT_MAPPER;

    static {
        OBJECT_MAPPER = new ObjectMapper();
        // 对象的所有字段全部列入，还是其他的选项，可以忽略null等
        OBJECT_MAPPER.setSerializationInclusion(JsonInclude.Include.ALWAYS);
        // 设置Date类型的序列化及反序列化格式
        OBJECT_MAPPER.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));

        // 忽略空Bean转json的错误
        OBJECT_MAPPER.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        // 忽略未知属性，防止json字符串中存在，java对象中不存在对应属性的情况出现错误
        OBJECT_MAPPER.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        // 注册一个时间序列化及反序列化的处理模块，用于解决jdk8中localDateTime等的序列化问题
        OBJECT_MAPPER.registerModule(new JavaTimeModule());
    }

    public static String toJsonStr(Object val) {
        return toJsonStr(val, false);
    }

    public static String toJsonStr(Object val, boolean prettyFormat) {
        try {
            return prettyFormat ? OBJECT_MAPPER.writerWithDefaultPrettyPrinter().writeValueAsString(val) : OBJECT_MAPPER.writeValueAsString(val);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public static byte[] toBytes(Object val) {
        try {
            return OBJECT_MAPPER.writeValueAsBytes(val);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public static <T> T parseObject(String json, Class<T> clazz) {
        try {
            return OBJECT_MAPPER.readValue(json, clazz);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public static <T> List<T> parseList(String json, Class<T> clazz) {
        try {
            CollectionType javaType = OBJECT_MAPPER.getTypeFactory()
                    .constructCollectionType(List.class, clazz);
            return OBJECT_MAPPER.readValue(json, javaType);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

//    public void main(String[] args) {
//        Map<String, String> map = new HashMap<>();
//        map.put("a", "123");
//        map.put("b", "456");
//
//        System.out.println(toString(map));
//        System.out.println(toString(map, true));
//        System.out.println(toString(map));
//
//        String json = toString(map);
//        map = parseObject(json, Map.class);
//        System.out.println(map.get("a"));
//
//        System.out.println();
//    }
}
