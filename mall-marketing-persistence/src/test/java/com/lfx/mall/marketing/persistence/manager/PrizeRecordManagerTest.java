package com.lfx.mall.marketing.persistence.manager;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.lfx.mall.marketing.persistence.AbstractSpringClass;
import com.lfx.mall.marketing.persistence.entity.PrizeRecord;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-05-20 17:00:17
 */
public class PrizeRecordManagerTest extends AbstractSpringClass {

    @Autowired
    private PrizeRecordManager prizeRecordManager;

    @Test
    public void getById() {
        prizeRecordManager.getById(123);
    }

    @Test
    public void getOne() {
        PrizeRecord entity = new PrizeRecord();
        entity.setMemberId(999);
        System.out.println(prizeRecordManager.getOne(Wrappers.query(entity)));
    }

    @Test
    public void insert() {
        PrizeRecord entity = new PrizeRecord();
        entity.setMemberId(123);
        entity.setActId(10);
        entity.setPrizeId(999);
        entity.setPrizeType(0);
        entity.setNum(1);
        entity.setMoney(10000);
        entity.setReceiveStatus(0);
        prizeRecordManager.save(entity);
    }
}
