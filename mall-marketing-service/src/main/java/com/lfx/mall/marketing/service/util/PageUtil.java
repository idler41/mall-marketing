package com.lfx.mall.marketing.service.util;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lfx.mall.marketing.service.base.request.PageRequest;
import com.lfx.mall.marketing.service.base.response.PageResult;

import java.util.List;

/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-08-13 14:54:04
 */
public class PageUtil {

    public static <T> Page<T> newPage(PageRequest request) {
        return new Page<>(request.getPageNum(), request.getPageSize(), request.isSearchCount());
    }

    public static <T> PageResult<T> newPageResult(List<T> data, Page<?> page) {
        return new PageResult<>(data, page.getTotal(), page.getPages());
    }
}
