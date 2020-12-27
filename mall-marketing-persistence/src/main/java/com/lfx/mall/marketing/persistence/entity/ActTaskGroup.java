package com.lfx.mall.marketing.persistence.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.io.Serializable;
import java.util.Date;

/**
 * @author <a href="mailto:idler41@163.con">idler41</a>
 * @date 2020-12-27 15:35:40
 */
@TableName("t_act_task_group")
@Data
public class ActTaskGroup implements Serializable {

    /**
     * 任务组id
     */
    private Integer id;

    /**
     * 活动id
     */
    private Integer actId;

    /**
     * 任务组名称
     */
    private String groupName;

    /**
     * 任务组类型
     */
    private Integer groupType;

    /**
     * 任务组奖励类型
     */
    private Integer rewardType;

    /**
     * 任务组奖励数量
     */
    private Integer rewardValue;

    /**
     * 当前状态 0--停用  1--启用
     */
    private Integer groupStatus;

    /**
     * 删除标识  0-未删除 1-已删除
     */
    private Integer isDelete;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;
}