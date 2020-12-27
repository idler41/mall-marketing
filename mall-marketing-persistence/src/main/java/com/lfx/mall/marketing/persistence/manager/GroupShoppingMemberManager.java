package com.lfx.mall.marketing.persistence.manager;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lfx.mall.marketing.persistence.dao.GroupShoppingMemberMapper;
import com.lfx.mall.marketing.persistence.entity.GroupShoppingMember;
import org.springframework.stereotype.Service;

/**
 * @author <a href="mailto:idler41@163.con">idler41</a>
 * @date 2020-12-27 15:47:13
 */
@Service
public class GroupShoppingMemberManager extends ServiceImpl<GroupShoppingMemberMapper, GroupShoppingMember> {

    public GroupShoppingMember getByGroupId(String groupId) {
        GroupShoppingMember entity = new GroupShoppingMember();
        entity.setGroupId(groupId);
        return baseMapper.selectOne(Wrappers.query(entity));
    }
}