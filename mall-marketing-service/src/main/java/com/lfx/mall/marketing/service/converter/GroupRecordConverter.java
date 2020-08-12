package com.lfx.mall.marketing.service.converter;

import com.lfx.mall.marketing.persistence.entity.GroupRecord;
import com.lfx.mall.marketing.service.response.GroupRecordResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-07-30 15:25:23
 */
@Mapper
public interface GroupRecordConverter {

    GroupRecordConverter INSTANCE = Mappers.getMapper(GroupRecordConverter.class);

    @Mappings({
            @Mapping(source="id", target="id"),
            @Mapping(source="activityId", target="activityId"),
    })
    GroupRecordResponse domainToResponse(GroupRecord groupRecord);

    List<GroupRecordResponse> domainToResponseList(List<GroupRecord> list);
}
