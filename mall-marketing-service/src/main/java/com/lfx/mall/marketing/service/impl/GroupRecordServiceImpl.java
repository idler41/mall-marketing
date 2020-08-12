package com.lfx.mall.marketing.service.impl;

import com.lfx.mall.marketing.persistence.manager.GroupRecordManager;
import com.lfx.mall.marketing.service.GroupRecordService;
import com.lfx.mall.marketing.service.request.MemberIdRequest;
import com.lfx.mall.marketing.service.response.GroupRecordResponse;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import javax.xml.ws.Response;

/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-07-30 15:23:16
 */
@Service
public class GroupRecordServiceImpl implements GroupRecordService {

    @Autowired
    private GroupRecordManager recordManager;

    @Override
    public Response<GroupRecordResponse> getOne(MemberIdRequest request) {
        return null;
    }
}
