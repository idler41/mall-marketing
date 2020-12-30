package com.lfx.mall.marketing.persistence.converter;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author <a href="mailto:idler41@163.con">idler41</a>
 * @date 2020-12-30 15:16:48
 */
@Mapper
public interface GroupShoppingMemberConverter {

    GroupShoppingMemberConverter INSTANCE = Mappers.getMapper(GroupShoppingMemberConverter.class);
}