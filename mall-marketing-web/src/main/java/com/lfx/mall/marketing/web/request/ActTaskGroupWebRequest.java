package com.lfx.mall.marketing.web.request;

import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-08-28 13:56:50
 */
@Data
@ToString(callSuper = true)
public class ActTaskGroupWebRequest implements Serializable {

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
    @NotNull
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