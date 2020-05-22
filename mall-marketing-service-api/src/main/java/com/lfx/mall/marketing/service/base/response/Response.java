package com.lfx.mall.marketing.service.base.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-05-22 10:14:26
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Response<T> implements Serializable {

    /**
     * 响应数据
     */
    private T data;

    /**
     * 响应码
     */
    private int code;

    /**
     * 错误提示
     */
    private String errorMsg;

    /**
     * true表示getData不为空，false需要调用errorCode/errorMsg来获取出错信息
     */
    private boolean success = false;
}
