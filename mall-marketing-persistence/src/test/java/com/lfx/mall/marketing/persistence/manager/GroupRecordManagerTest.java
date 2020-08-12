package com.lfx.mall.marketing.persistence.manager;

import com.lfx.mall.marketing.persistence.base.AbstractSpringTest;
import com.lfx.mall.marketing.persistence.entity.GroupRecord;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-06-08 18:08:45
 */
public class GroupRecordManagerTest extends AbstractSpringTest {

    @Autowired
    private GroupRecordManager groupRecordManager;

    private static GroupRecord groupRecord;

    @BeforeClass
    public static void init() {
        initSysProperty();
        groupRecord = readJsonFile("groupRecord.json", GroupRecord.class);
    }

    @Test
    public void getByMemberId() {
        System.out.println(groupRecordManager.getByMemberId(groupRecord));
    }
}
