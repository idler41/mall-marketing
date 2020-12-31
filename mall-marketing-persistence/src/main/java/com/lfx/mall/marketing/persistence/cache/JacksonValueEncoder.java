package com.lfx.mall.marketing.persistence.cache;

import com.alicp.jetcache.support.AbstractValueEncoder;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-07-29 16:43:08
 */
public class JacksonValueEncoder extends AbstractValueEncoder {

    private final ObjectMapper instance;

    public JacksonValueEncoder(ObjectMapper instance) {
        super(false);
        this.instance = instance;
    }

    @Override
    public byte[] apply(Object o) {
        try {
            return instance.writeValueAsBytes(o);
        } catch (JsonProcessingException ex) {
            throw new RuntimeException("Could not write JSON: " + ex.getMessage(), ex);
        }
    }
}
