package com.lfx.mall.marketing.service.converter;

import com.lfx.mall.marketing.persistence.entity.Activity;
import com.lfx.mall.marketing.service.response.ActivityResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-09-03 16:48:17
 */
@Mapper
public interface ActivityConverter {

    ActivityConverter INSTANCE = Mappers.getMapper(ActivityConverter.class);

    ActivityResponse domainToResponse(Activity domain);

    List<ActivityResponse> domainToResponseList(List<Activity> list);
}