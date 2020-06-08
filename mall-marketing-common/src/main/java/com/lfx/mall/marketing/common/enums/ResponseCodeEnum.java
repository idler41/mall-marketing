package com.lfx.mall.marketing.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-05-22 10:33:55
 */
@AllArgsConstructor
public enum ResponseCodeEnum {

    /**
     * 正常响应
     */
    SUCCEED(0, "成功"),

    /**
     * 服务级别错误码10XX
     */
    SERVICE_ERROR(1000, "服务异常"),

    /**
     * 数据不存在
     */
    DATA_NOT_FOUND_ERROR(1001, "数据不存在"),
    ;

    @Getter
    private int code;

    @Getter
    private String desc;
}
