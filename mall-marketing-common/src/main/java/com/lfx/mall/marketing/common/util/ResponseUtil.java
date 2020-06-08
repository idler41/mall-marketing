package com.lfx.mall.marketing.common.util;

import com.lfx.mall.marketing.common.enums.ResponseCodeEnum;
import com.lfx.mall.marketing.common.response.Response;
import lombok.experimental.UtilityClass;


/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-05-22 11:45:37
 */
@UtilityClass
public class ResponseUtil {

    public <T> Response<T> success(T data) {
        return data == null ? fail(ResponseCodeEnum.DATA_NOT_FOUND_ERROR) : new Response<>(data, ResponseCodeEnum.SUCCEED.getCode(), null, true);
    }

    public <T> Response<T> fail(ResponseCodeEnum error) {
        return new Response<>(null, error.getCode(), error.getDesc(), false);
    }
}
