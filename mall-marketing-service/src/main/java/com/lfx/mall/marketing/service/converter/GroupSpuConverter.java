package com.lfx.mall.marketing.service.converter;

import com.lfx.mall.marketing.persistence.entity.GroupSpu;
import com.lfx.mall.marketing.service.response.GroupSpuResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-09-03 16:48:17
 */
@Mapper
public interface GroupSpuConverter {

    GroupSpuConverter INSTANCE = Mappers.getMapper(GroupSpuConverter.class);

    GroupSpuResponse doToVo(GroupSpu domain);

    List<GroupSpuResponse> doListToVoList(List<GroupSpu> list);
}