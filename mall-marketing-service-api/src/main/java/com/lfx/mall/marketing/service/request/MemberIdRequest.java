package com.lfx.mall.marketing.service.request;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-07-30 15:20:13
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MemberIdRequest extends IdRequest<Integer>{

    /**
     * 用户id
     */
    private Integer memberId;
}
