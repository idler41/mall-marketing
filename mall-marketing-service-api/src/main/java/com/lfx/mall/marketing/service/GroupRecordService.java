package com.lfx.mall.marketing.service;

import com.lfx.mall.marketing.service.request.MemberIdRequest;
import com.lfx.mall.marketing.service.response.GroupRecordResponse;

import javax.xml.ws.Response;

/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-05-22 14:17:12
 */
public interface GroupRecordService {

    Response<GroupRecordResponse> getOne(MemberIdRequest request);
}
