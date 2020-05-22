package com.lfx.mall.marketing.service;

import com.lfx.mall.marketing.service.base.response.Response;
import com.lfx.mall.marketing.service.request.MemberIdRequest;
import com.lfx.mall.marketing.service.response.PrizeRecordResponse;

/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-05-22 14:17:12
 */
public interface PrizeRecordService {

    Response<PrizeRecordResponse> getOne(MemberIdRequest<Integer> request);
}
