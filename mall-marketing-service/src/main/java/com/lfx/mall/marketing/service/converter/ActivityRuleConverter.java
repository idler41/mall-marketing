package com.lfx.mall.marketing.service.converter;

import com.lfx.mall.marketing.persistence.entity.ActivityRule;
import com.lfx.mall.marketing.service.response.ActivityRuleResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-09-03 16:48:17
 */
@Mapper
public interface ActivityRuleConverter {

    ActivityRuleConverter INSTANCE = Mappers.getMapper(ActivityRuleConverter.class);

    ActivityRuleResponse domainToResponse(ActivityRule domain);

    List<ActivityRuleResponse> domainToResponseList(List<ActivityRule> list);
}