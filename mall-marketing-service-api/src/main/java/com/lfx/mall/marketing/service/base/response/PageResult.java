package com.lfx.mall.marketing.service.base.response;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-08-13 14:24:21
 */
@Data
@ToString(callSuper = true)
public class PageResult<T> implements Serializable {

    /**
     * 分页记录集合
     */
    private List<T> records;

    /**
     * 总记录数
     */
    private int totalRecord;

    /**
     * 总页数
     */
    private int totalPage;
}
