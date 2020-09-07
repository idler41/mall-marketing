package com.lfx.mall.marketing.common.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;

import java.util.List;

/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-05-21 14:39:16
 */
public class JacksonUtil {

    public static final ObjectMapper OBJECT_MAPPER;

    static {
        OBJECT_MAPPER = new ObjectMapper();
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
