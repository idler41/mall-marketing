package com.lfx.mall.marketing.common.request;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-05-22 10:40:53
 */
@Data
@NoArgsConstructor
public class Request implements Serializable {

    /**
     * 用户id
     */
    private String memberId;

    /**
     * 请求追溯id
     */
    private String traceId;
}
