package com.lfx.mall.marketing.service;

import com.lfx.mall.marketing.service.base.request.IdRequest;
import com.lfx.mall.marketing.service.base.response.PageResult;
import com.lfx.mall.marketing.service.base.response.Response;
import com.lfx.mall.marketing.service.request.ActTaskGroupPageRequest;
import com.lfx.mall.marketing.service.response.ActTaskGroupResponse;


/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-05-22 14:17:12
 */
public interface ActTaskGroupService {

    Response<ActTaskGroupResponse> get(IdRequest<Integer> request);

    Response<PageResult<ActTaskGroupResponse>> page(ActTaskGroupPageRequest request);
}
