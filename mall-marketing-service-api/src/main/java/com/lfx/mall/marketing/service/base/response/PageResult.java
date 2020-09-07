package com.lfx.mall.marketing.service.base.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-08-13 14:24:21
 */
@Data
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class PageResult<T> implements Serializable {

    /**
     * 分页记录集合
     */
    private List<T> records;

    /**
     * 总记录数
     */
    private long totalRecord;

    /**
     * 总页数
     */
    private long totalPage;
}
