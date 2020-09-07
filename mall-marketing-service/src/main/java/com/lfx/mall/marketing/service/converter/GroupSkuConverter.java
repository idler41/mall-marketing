package com.lfx.mall.marketing.service.converter;

import com.lfx.mall.marketing.persistence.entity.GroupSku;
import com.lfx.mall.marketing.service.response.GroupSkuResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-09-03 16:48:17
 */
@Mapper
public interface GroupSkuConverter {

    GroupSkuConverter INSTANCE = Mappers.getMapper(GroupSkuConverter.class);

    GroupSkuResponse domainToResponse(GroupSku domain);

    List<GroupSkuResponse> domainToResponseList(List<GroupSku> list);
}