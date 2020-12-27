package com.lfx.mall.marketing.persistence.manager;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lfx.mall.marketing.persistence.dao.GroupShoppingMapper;
import com.lfx.mall.marketing.persistence.entity.GroupShopping;
import org.springframework.stereotype.Service;

/**
 * @author <a href="mailto:idler41@163.con">idler41</a>
 * @date 2020-12-27 15:47:13
 */
@Service
public class GroupShoppingManager extends ServiceImpl<GroupShoppingMapper, GroupShopping> {

    public GroupShopping getByLeaderId(Integer memberId) {
        GroupShopping entity = new GroupShopping();
        entity.setLeaderId(memberId);
        return baseMapper.selectOne(Wrappers.query(entity));
    }
}