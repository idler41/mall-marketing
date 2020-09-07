package com.lfx.mall.marketing.service.response;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-09-03 16:48:17
 */
@Data
public class ActivityResponse implements Serializable {

    /**
     *
     */
    private Integer id;

    /**
     * 活动名称
     */
    private String name;

    /**
     * 活动介绍
     */
    private String introduction;

    /**
     * 活动状态 1-待上线 2-已上线, 3-已结束，4-已关闭
     */
    private Integer actStatus;

    /**
     * 活动类型 0-拼团 1-双倍佣金 2-免单 3-权益
     */
    private Integer actType;

    /**
     * 活动开始时间
     */
    private Date startTime;

    /**
     * 结束时间
     */
    private Date endTime;

    /**
     * 活动预热提前时间(单位：秒)
     */
    private Integer preheatTime;

    /**
     * 删除标识  0-未删除 1-已删除
     */
    private Integer deleteFlag;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;
}