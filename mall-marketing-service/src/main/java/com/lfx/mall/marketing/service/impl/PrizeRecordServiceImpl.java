package com.lfx.mall.marketing.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.lfx.mall.marketing.common.util.CachedBeanCopier;
import com.lfx.mall.marketing.persistence.entity.PrizeRecord;
import com.lfx.mall.marketing.persistence.manager.PrizeRecordManager;
import com.lfx.mall.marketing.service.PrizeRecordService;
import com.lfx.mall.marketing.service.base.response.Response;
import com.lfx.mall.marketing.service.base.util.ResponseUtil;
import com.lfx.mall.marketing.service.request.MemberIdRequest;
import com.lfx.mall.marketing.service.response.PrizeRecordResponse;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-05-22 14:22:01
 */
@Service
public class PrizeRecordServiceImpl implements PrizeRecordService {

    @Autowired
    private PrizeRecordManager prizeRecordManager;

    @Override
    public Response<PrizeRecordResponse> getOne(MemberIdRequest<Integer> request) {
        PrizeRecord entity = new PrizeRecord();
        entity.setMemberId(request.getValue());
        PrizeRecord data = prizeRecordManager.getOne(Wrappers.query(entity));
        return ResponseUtil.success(CachedBeanCopier.copy(data, PrizeRecordResponse.class));
    }
}
