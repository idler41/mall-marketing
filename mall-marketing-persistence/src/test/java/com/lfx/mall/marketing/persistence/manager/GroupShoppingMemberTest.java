package com.lfx.mall.marketing.persistence.manager;

import com.lfx.mall.marketing.persistence.base.AbstractSpringTest;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class GroupShoppingMemberTest extends AbstractSpringTest {

    @Autowired
    private GroupShoppingMemberManager manager;

    @BeforeClass
    public static void setup() {
        initSysProperty();
    }

    @Test
    public void getByMemberId() {
        System.out.println(manager.getByGroupId("1"));
    }
}
