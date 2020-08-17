package com.lfx.mall.marketing.persistence.manager;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lfx.mall.marketing.persistence.base.AbstractSpringTest;
import com.lfx.mall.marketing.persistence.entity.ActTaskGroup;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-06-05 10:00:08
 */
public class ActTaskGroupManagerTest extends AbstractSpringTest {

    @Autowired
    private ActTaskGroupManager manager;

    @BeforeClass
    public static void setup() {
        initSysProperty();
    }

    @Test
    public void getById() {
        System.out.println(toJsonStr(manager.getById(1), true));
    }

    @Test
    public void pageByActId() {
        Page<ActTaskGroup> page = new Page<>(1, 10);
        System.out.println(toJsonStr(manager.pageByActId(page, 0), true));
    }
}
