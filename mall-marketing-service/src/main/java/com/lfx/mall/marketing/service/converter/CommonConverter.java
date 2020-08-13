package com.lfx.mall.marketing.service.converter;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lfx.mall.marketing.service.base.response.PageResult;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-08-13 15:23:48
 */
public interface CommonConverter<T, R> {

    R domainToResponse(T t);

    List<R> domainToResponseList(List<T> list);

    @Mappings({
            @Mapping(source = "total", target = "totalRecord"),
            @Mapping(source = "pages", target = "totalPage")
    })
    PageResult<R> pageToPageResult(Page<T> page);
}
