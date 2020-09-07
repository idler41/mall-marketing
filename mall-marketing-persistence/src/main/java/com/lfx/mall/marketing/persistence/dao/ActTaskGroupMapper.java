package com.lfx.mall.marketing.persistence.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lfx.mall.marketing.persistence.entity.ActTaskGroup;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-07-16 18:54:04
 */
@Repository
public interface ActTaskGroupMapper extends BaseMapper<ActTaskGroup> {

    List<ActTaskGroup> selectPageByActId(Page<ActTaskGroup> page, @Param("actId") Integer actId);

}