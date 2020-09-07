package com.lfx.mall.marketing.service.response;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-09-03 16:48:17
 */
@Data
public class GroupSpuResponse implements Serializable {

    /**
     *
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