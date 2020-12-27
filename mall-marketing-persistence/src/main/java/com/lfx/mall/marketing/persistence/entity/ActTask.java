package com.lfx.mall.marketing.persistence.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.io.Serializable;
import java.util.Date;

/**
 * @author <a href="mailto:idler41@163.con">idler41</a>
 * @date 2020-12-27 15:35:40
 */
@TableName("t_act_task")
@Data
public class ActTask implements Serializable {

    /**
     * 任务id
     */
    private Integer id;

    /**
     * 活动id
     */
    private Integer actId;

    /**
     * 任务组id
     */
    private Integer taskGroupId;

    /**
     * 任务名称
     */
    private String taskName;

    /**
     * 任务类型
     */
    private Integer taskType;

    /**
     * 任务完成目标值
     */
    private String targetValue;

    /**
     * 循环类型 0--单次任务 1--重复任务
     */
    private Integer repeatFlag;

    /**
     * 任务组奖励类型
     */
    private Integer rewardType;

    /**
     * 奖励值
     */
    private String rewardValue;

    /**
     * 任务排序
     */
    private Integer taskOrder;

    /**
     * 当前状态 0--停用  1--启用
     */
    private Integer taskStatus;

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