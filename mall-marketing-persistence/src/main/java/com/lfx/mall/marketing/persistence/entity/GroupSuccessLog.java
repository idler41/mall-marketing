package com.lfx.mall.marketing.persistence.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.io.Serializable;
import java.util.Date;

/**
 * @author <a href="mailto:idler41@163.con">idler41</a>
 * @date 2020-12-30 15:17:05
 */
@TableName("t_group_success_log")
@Data
public class GroupSuccessLog implements Serializable {

    /**
     * 成团日志id
     */
    private Integer id;

    /**
     * 活动商品id
     */
    private Integer actSpuId;

    /**
     * 开团id
     */
    private String groupId;

    /**
     * 团长用户id
     */
    private Integer leaderId;

    /**
     * 团开始时间
     */
    private Date startTime;

    /**
     * 拼团完成时间
     */
    private Date finishTime;

    /**
     * 最后成团用户id
     */
    private Integer lastMemberId;

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