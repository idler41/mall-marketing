package com.lfx.mall.marketing.persistence.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.io.Serializable;
import java.util.Date;

/**
 * @author <a href="mailto:idler41@163.con">idler41</a>
 * @date 2020-12-31 15:11:49
 */
@TableName("t_group_spu")
@Data
public class GroupSpu implements Serializable {

    /**
     * 活动商品id
     */
    private Integer id;

    /**
     * 活动id
     */
    private Integer actId;

    /**
     * 活动规则id
     */
    private Integer actRuleId;

    /**
     * 原商品id
     */
    private Integer spuId;

    /**
     * 促销套餐标题
     */
    private String title;

    /**
     * 商品名称
     */
    private String spuName;

    /**
     * 商品描述
     */
    private String spuDesc;

    /**
     * 商品图片
     */
    private String spuImg;

    /**
     * 商品拼团售价
     */
    private Long spuPrice;

    /**
     * 商家用户id
     */
    private Integer sellerId;

    /**
     * 审核状态 0-未审核 1-审核通过 2-审核拒绝
     */
    private Integer auditStatus;

    /**
     * 商品状态 0-下架 1-上架
     */
    private Integer spuStatus;

    /**
     * 已成团数量
     */
    private Integer groupFinishAmount;

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