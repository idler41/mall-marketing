package com.lfx.mall.marketing.persistence.cache;

import com.alicp.jetcache.support.AbstractValueDecoder;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-07-29 16:43:08
 */
public class JacksonValueDecoder extends AbstractValueDecoder {

    private ObjectMapper instance;

    public JacksonValueDecoder(ObjectMapper instance) {
        super(false);
        this.instance = instance;
    }

    @Override
    protected Object doApply(byte[] buffer) throws Exception {
        return instance.readValue(buffer, Object.class);
    }
}
