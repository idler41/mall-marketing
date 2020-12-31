package com.lfx.mall.marketing.persistence.manager;

import com.lfx.mall.marketing.persistence.base.AbstractSpringTest;
import org.junit.BeforeClass;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author <a href="mailto:idler41@163.con">idler41</a>
 * @date 2020-12-31 15:12:10
 */
public class GroupShoppingManagerTest extends AbstractSpringTest {

    @Autowired
    private GroupShoppingManager manager;

    @BeforeClass
    public static void setup() {
        initSysProperty();
    }
}