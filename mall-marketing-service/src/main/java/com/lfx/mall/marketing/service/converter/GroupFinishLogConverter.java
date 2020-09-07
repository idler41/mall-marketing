package com.lfx.mall.marketing.service.converter;

import com.lfx.mall.marketing.persistence.entity.GroupFinishLog;
import com.lfx.mall.marketing.service.response.GroupFinishLogResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-09-03 16:48:17
 */
@Mapper
public interface GroupFinishLogConverter {

    GroupFinishLogConverter INSTANCE = Mappers.getMapper(GroupFinishLogConverter.class);

    GroupFinishLogResponse domainToResponse(GroupFinishLog domain);

    List<GroupFinishLogResponse> domainToResponseList(List<GroupFinishLog> list);
}