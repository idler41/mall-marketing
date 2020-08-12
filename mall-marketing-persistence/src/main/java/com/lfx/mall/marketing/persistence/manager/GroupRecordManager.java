package com.lfx.mall.marketing.persistence.manager;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lfx.mall.marketing.persistence.dao.GroupRecordMapper;
import com.lfx.mall.marketing.persistence.entity.GroupRecord;
import org.springframework.stereotype.Service;

/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-06-08 17:58:03
 */
@Service
public class GroupRecordManager extends ServiceImpl<GroupRecordMapper, GroupRecord> {

    public GroupRecord getByMemberId(GroupRecord entity) {
        return baseMapper.selectOne(Wrappers.query(entity));
    }

}