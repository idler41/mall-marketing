package com.lfx.mall.marketing.service.base.request;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-05-22 11:37:09
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class PageRequest extends Request {

    /**
     * 当前页
     */
    @NotNull
    @Min(1)
    private Integer pageNum;

    /**
     * 分页大小
     */
    @NotNull
    @Min(1)
    private Integer pageSize;

    /**
     * 查询总记录数（默认 true）
     */
    private boolean searchCount = true;
}
