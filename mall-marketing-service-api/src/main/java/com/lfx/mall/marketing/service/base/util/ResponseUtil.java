package com.lfx.mall.marketing.service.base.util;


import com.lfx.mall.marketing.service.base.enums.ResponseCodeEnum;
import com.lfx.mall.marketing.service.base.response.Response;

/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-05-22 11:45:37
 */
public class ResponseUtil {

    public static <T> Response<T> success(T data) {
        return data == null ? fail(ResponseCodeEnum.DATA_NOT_FOUND_ERROR) : new Response<>(data, ResponseCodeEnum.SUCCEED.getCode(), null, true);
    }

    public static <T> Response<T> fail(ResponseCodeEnum error) {
        return new Response<>(null, error.getCode(), error.getDesc(), false);
    }
}
