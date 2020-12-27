package com.lfx.mall.marketing.persistence.converter;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author <a href="mailto:idler41@163.con">idler41</a>
 * @date 2020-12-27 16:28:36
 */
@Mapper
public interface GroupSuccessLogConverter {

    GroupSuccessLogConverter INSTANCE = Mappers.getMapper(GroupSuccessLogConverter.class);
}