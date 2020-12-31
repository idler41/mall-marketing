package com.lfx.mall.marketing.persistence.config;

import com.alicp.jetcache.anno.config.EnableCreateCacheAnnotation;
import com.alicp.jetcache.anno.config.EnableMethodCache;
import com.alicp.jetcache.anno.support.SpringConfigProvider;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lfx.mall.marketing.persistence.cache.JacksonKeyConvertor;
import com.lfx.mall.marketing.persistence.cache.JacksonValueDecoder;
import com.lfx.mall.marketing.persistence.cache.JacksonValueEncoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;
import java.util.TimeZone;
import java.util.function.Function;

/**
 * @author linfuxin
 * @date 2020-12-31 13:53:14
 */
@EnableMethodCache(basePackages = "com.lfx.mall.marketing.persistence.manager")
@EnableCreateCacheAnnotation
@Configuration
public class RedisConfig {

    @Bean
    public ObjectMapper objectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
        objectMapper.setTimeZone(TimeZone.getTimeZone("GMT+8"));
        return objectMapper;
    }

    @Bean
    public JacksonKeyConvertor jacksonRedisKeyConvertor() {
        return new JacksonKeyConvertor();
    }

    @Bean
    public JacksonValueDecoder jacksonValueDecoder(ObjectMapper objectMapper) {
        return new JacksonValueDecoder(objectMapper);
    }

    @Bean
    public JacksonValueEncoder jacksonValueEncoder(ObjectMapper objectMapper) {
        return new JacksonValueEncoder(objectMapper);
    }

    @Bean
    public SpringConfigProvider springConfigProvider(
            JacksonKeyConvertor jacksonRedisKeyConvertor,
            JacksonValueDecoder jacksonValueDecoder,
            JacksonValueEncoder jacksonValueEncoder
    ) {
        return new SpringConfigProvider() {

            @Override
            public Function<Object, Object> parseKeyConvertor(String convertor) {
                if ("jackson".equalsIgnoreCase(convertor)) {
                    return jacksonRedisKeyConvertor;
                } else {
                    return super.parseKeyConvertor(convertor);
                }
            }

            @Override
            public Function<Object, byte[]> parseValueEncoder(String valueEncoder) {
                if ("jackson".equalsIgnoreCase(valueEncoder)) {
                    return jacksonValueEncoder;
                } else {
                    return super.parseValueEncoder(valueEncoder);
                }
            }

            @Override
            public Function<byte[], Object> parseValueDecoder(String valueDecoder) {
                if ("jackson".equalsIgnoreCase(valueDecoder)) {
                    return jacksonValueDecoder;
                } else {
                    return super.parseValueDecoder(valueDecoder);
                }
            }
        };
    }
}
