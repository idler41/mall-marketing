package com.lfx.mall.marketing.persistence.dao;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.lfx.mall.marketing.persistence.AbstractSpringClass;
import com.lfx.mall.marketing.persistence.entity.PrizeRecord;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-05-18 16:18:51
 */
public class PrizeRecordMapperTest extends AbstractSpringClass {

    @Autowired
    private PrizeRecordMapper prizeRecordMapper;

    @Test
    public void selectList() {
        PrizeRecord entity = new PrizeRecord();
        entity.setMemberId(22);
        prizeRecordMapper.selectList(Wrappers.query(entity));
    }
}
