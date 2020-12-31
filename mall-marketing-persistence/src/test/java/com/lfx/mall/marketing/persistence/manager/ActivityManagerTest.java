package com.lfx.mall.marketing.persistence.manager;

import com.lfx.mall.marketing.persistence.base.AbstractSpringTest;
import com.lfx.mall.marketing.persistence.entity.Activity;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author <a href="mailto:idler41@163.con">idler41</a>
 * @date 2020-12-31 15:11:49
 */
public class ActivityManagerTest extends AbstractSpringTest {

    @Autowired
    private ActivityManager manager;

    @BeforeClass
    public static void setup() {
        initSysProperty();
    }

    @Test
    public void saveTest() {
        manager.save(readJsonFile("activity.json", Activity.class));
    }

    @Test
    public void getByIdTest() {
        manager.getById(100);
    }
}