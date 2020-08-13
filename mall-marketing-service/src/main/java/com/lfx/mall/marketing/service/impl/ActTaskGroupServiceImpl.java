package com.lfx.mall.marketing.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lfx.mall.marketing.service.base.request.IdRequest;
import com.lfx.mall.marketing.service.base.response.PageResult;
import com.lfx.mall.marketing.service.base.response.Response;
import com.lfx.mall.marketing.service.base.util.ResponseUtil;
import com.lfx.mall.marketing.persistence.entity.ActTaskGroup;
import com.lfx.mall.marketing.persistence.manager.ActTaskGroupManager;
import com.lfx.mall.marketing.service.request.ActTaskGroupPageRequest;
import com.lfx.mall.marketing.service.response.ActTaskGroupResponse;
import com.lfx.mall.marketing.service.ActTaskGroupService;
import com.lfx.mall.marketing.service.converter.ActTaskGroupConverter;
import com.lfx.mall.marketing.service.util.PageUtil;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-07-30 15:23:16
 */
@Service
public class ActTaskGroupServiceImpl implements ActTaskGroupService {

    private final ActTaskGroupConverter converter = ActTaskGroupConverter.INSTANCE;

    @Autowired
    private ActTaskGroupManager actTaskGroupManager;

    @Override
    public Response<ActTaskGroupResponse> get(IdRequest<Integer> request) {
        ActTaskGroup dbData = actTaskGroupManager.getById(request.getValue());
        ActTaskGroupResponse result = converter.domainToResponse(dbData);
        return ResponseUtil.success(result);
    }

    @Override
    public Response<PageResult<ActTaskGroupResponse>> page(ActTaskGroupPageRequest request) {
        Page<ActTaskGroup> page = PageUtil.newPage(request);
        actTaskGroupManager.pageByActId(page, request.getActId());
        PageResult<ActTaskGroupResponse> result = converter.pageToPageResult(page);
        return ResponseUtil.success(result);
    }
}
