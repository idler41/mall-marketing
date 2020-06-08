package com.lfx.mall.marketing.persistence.manager;

import com.lfx.mall.marketing.persistence.base.AbstractSpringTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-06-05 10:00:08
 */
public class TaskLogManagerTest extends AbstractSpringTest {

    @Autowired
    private TaskLogManager taskLogManager;

    @Test
    public void getById() {
        taskLogManager.getById(1);
    }
}
