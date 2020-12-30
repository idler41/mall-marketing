package com.lfx.mall.marketing.persistence.manager;

import com.lfx.mall.marketing.persistence.base.AbstractSpringTest;
import org.junit.BeforeClass;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author <a href="mailto:idler41@163.con">idler41</a>
 * @date 2020-12-30 15:17:05
 */
public class ActivityManagerTest extends AbstractSpringTest {

    @Autowired
    private ActivityManager manager;

    @BeforeClass
    public static void setup() {
        initSysProperty();
    }
}