package com.lfx.mall.marketing.persistence.manager;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lfx.mall.marketing.persistence.dao.ActTaskMapper;
import com.lfx.mall.marketing.persistence.entity.ActTask;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-07-16 18:54:04
 */
@Service
public class ActTaskManager extends ServiceImpl<ActTaskMapper, ActTask> {

    @Override
    public ActTask getById(Serializable id) {
        return super.getById(id);
    }

    public List<ActTask> selectByIds(List<Integer> ids) {
        List<ActTask> result = new ArrayList<>(ids.size());
        for (Integer id : ids) {
            result.add(getById(id));
        }
        return result;
    }

    @Override
    public boolean updateById(ActTask entity) {
        return super.updateById(entity);
    }
}