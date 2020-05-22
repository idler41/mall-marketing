package com.lfx.mall.marketing.service.base.request;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-05-22 11:37:09
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@RequiredArgsConstructor(staticName = "of")
public class PageQueryRequest extends Request {

    /**
     * 当前页
     */
    @NonNull
    private Integer pageNum;

    /**
     * 分页大小
     */
    @NonNull
    private Integer pageSize;
}
