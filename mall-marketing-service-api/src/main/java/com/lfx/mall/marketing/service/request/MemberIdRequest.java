package com.lfx.mall.marketing.service.request;

import com.lfx.mall.marketing.service.base.request.KeyRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-07-30 15:20:13
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class MemberIdRequest extends KeyRequest<Integer> {
}
