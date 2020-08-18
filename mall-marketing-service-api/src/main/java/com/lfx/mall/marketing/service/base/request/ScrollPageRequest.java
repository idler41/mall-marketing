package com.lfx.mall.marketing.service.base.request;

import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-08-13 11:15:14
 */
@Data
@ToString(callSuper = true)
public class ScrollPageRequest<T extends Serializable & Comparable<? super T>> implements Serializable {

    /**
     * 起始数据
     */
    @NotNull
    private T preValue;

    /**
     * 分页大小
     */
    @NotNull
    @Min(1)
    private Integer pageSize;
}
