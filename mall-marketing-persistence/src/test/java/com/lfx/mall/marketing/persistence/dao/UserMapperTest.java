package com.lfx.mall.marketing.persistence.dao;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lfx.mall.marketing.persistence.AbstractSpringClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-05-17 11:43:00
 */
public class UserMapperTest extends AbstractSpringClass {

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
