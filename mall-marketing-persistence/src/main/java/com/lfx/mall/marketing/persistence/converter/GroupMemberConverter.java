package com.lfx.mall.marketing.persistence.converter;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author <a href="mailto:idler41@163.con">idler41</a>
 * @date 2020-12-31 15:12:10
 */
@Mapper
public interface GroupMemberConverter {

    GroupMemberConverter INSTANCE = Mappers.getMapper(GroupMemberConverter.class);
}