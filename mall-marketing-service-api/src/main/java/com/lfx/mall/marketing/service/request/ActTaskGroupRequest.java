package com.lfx.mall.marketing.service.request;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-07-16 18:54:04
 */
@Data
@ToString(callSuper = true)
public class ActTaskGroupRequest implements Serializable {

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
     * 扩展json
     */
    private String extendJson;

    /**
     * 当前状态 0--停用  1--启用
     */
    private Integer groupStatus;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;
}