package com.lfx.mall.marketing.service.converter;

import com.lfx.mall.marketing.persistence.entity.ActTaskGroup;
import com.lfx.mall.marketing.service.response.ActTaskGroupResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-07-30 15:25:23
 */
@Mapper
public interface ActTaskGroupConverter extends CommonConverter<ActTaskGroup, ActTaskGroupResponse> {

    ActTaskGroupConverter INSTANCE = Mappers.getMapper(ActTaskGroupConverter.class);
}
