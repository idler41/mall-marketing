package com.lfx.mall.marketing.persistence.dao;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lfx.mall.marketing.persistence.config.PersistenceConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-05-17 11:43:00
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = PersistenceConfig.class)
public class UserMapperTest {

    @Autowired
    private TaskLogMapper taskLogMapper;

    @Test
    public void selectList() {
        System.out.println(taskLogMapper.selectList(Wrappers.emptyWrapper()));
    }

    @Test
    public void selectPage() {
        System.out.println(taskLogMapper.selectPage(new Page<>(), Wrappers.emptyWrapper()));
    }
}
