package com.lfx.mall.marketing.persistence.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.io.Serializable;
import java.util.Date;

/**
 * @author <a href="mailto:idler41@163.con">idler41</a>
 * @date 2020-12-31 15:11:49
 */
@TableName("t_group_sku")
@Data
public class GroupSku implements Serializable {

    /**
     * 活动货品id
     */
    private Integer id;

    /**
     * 活动id
     */
    private Integer actId;

    /**
     * 活动商品id
     */
    private Integer actSpuId;

    /**
     * 原货品id
     */
    private Integer skuId;

    /**
     * 货品名称
     */
    private String skuName;

    /**
     * 货品描述
     */
    private String skuDesc;

    /**
     * 货品图片
     */
    private String skuImg;

    /**
     * 优先展示 0-否 1-是
     */
    private Integer isFirstShow;

    /**
     * 货品状态 0-下架 1-上架
     */
    private Integer skuStatus;

    /**
     * 货品商城价(单位分)
     */
    private Long mallPrice;

    /**
     * 货品活动价(单位分)
     */
    private Long actPrice;

    /**
     * 佣金比例 如: 20代表20%
     */
    private Integer actCommissionRate;

    /**
     * 佣金金额(单位分)
     */
    private Integer actCommission;

    /**
     * 服务费比例 如: 20代表20%
     */
    private Integer actServiceRate;

    /**
     * 服务费金额(单位分)
     */
    private Integer actService;

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