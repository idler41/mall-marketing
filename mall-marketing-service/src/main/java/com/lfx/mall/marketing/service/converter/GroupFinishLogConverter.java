package com.lfx.mall.marketing.service.converter;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-09-03 16:48:17
 */
@Mapper
public interface GroupFinishLogConverter {

    GroupFinishLogConverter INSTANCE = Mappers.getMapper(GroupFinishLogConverter.class);
}