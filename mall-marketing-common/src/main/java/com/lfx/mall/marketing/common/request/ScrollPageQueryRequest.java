package com.lfx.mall.marketing.common.request;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-05-22 11:32:16
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ScrollPageQueryRequest<T extends Serializable & Comparable<? super T>> extends Request {
    /**
     * 分页大小
     */
    private Integer pageSize;

    /**
     * 上页起始的数据
     */
    private T preValue;

    /**
     * 下页起始的数据
     */
    private T nextValue;
}
