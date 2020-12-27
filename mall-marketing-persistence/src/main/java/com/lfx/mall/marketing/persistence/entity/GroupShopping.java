package com.lfx.mall.marketing.persistence.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.io.Serializable;
import java.util.Date;

/**
 * @author <a href="mailto:idler41@163.con">idler41</a>
 * @date 2020-12-27 15:47:13
 */
@TableName("t_group_shopping")
@Data
public class GroupShopping implements Serializable {

    /**
     * 开团id
     */
    private String id;

    /**
     * 原始拼团id
     */
    private String parentId;

    /**
     * 活动id
     */
    private Integer actId;

    /**
     * 活动商品id
     */
    private Integer actSpuId;

    /**
     * 活动货品id
     */
    private Integer actSkuId;

    /**
     * 商品id
     */
    private Integer spuId;

    /**
     * 货品id
     */
    private Integer skuId;

    /**
     * 商品名称
     */
    private String spuName;

    /**
     * 商家id
     */
    private Integer sellerId;

    /**
     * 商家名称
     */
    private String sellerName;

    /**
     * 购买单价
     */
    private Long price;

    /**
     * 购买数量
     */
    private Integer number;

    /**
     * 团长用户id
     */
    private Integer leaderId;

    /**
     * 团长昵称
     */
    private String leaderNickName;

    /**
     * 团长头像
     */
    private String leaderAvatar;

    /**
     * 开团订单编号
     */
    private String orderSn;

    /**
     * 开团父订单编号
     */
    private String orderPsn;

    /**
     * 红包标记: 0-没有红包 1-有红包
     */
    private Integer idRedPacket;

    /**
     * 团类型: 0-普通拼团 1-拼团赚
     */
    private Integer groupType;

    /**
     * 团状态：0-待成团 1-已成团 2-已失效
     */
    private Integer groupStatus;

    /**
     * 团大小，如2人团、10人团
     */
    private Integer groupSize;

    /**
     * 已参团人数
     */
    private Integer groupMemberAmount;

    /**
     * 团过期时间
     */
    private Date expireTime;

    /**
     * 团开始时间
     */
    private Date startTime;

    /**
     * 拼团完成时间
     */
    private Date finishTime;

    /**
     * 成团补齐机器人实际工作时间(单位分钟)
     */
    private Integer robotWorkMinutes;

    /**
     * 成团补齐机器人工作最小开始时间(单位分钟)
     */
    private Integer robotWorkMinMinutes;

    /**
     * 成团补齐机器人工作最大开始时间(单位分钟)
     */
    private Integer robotWorkMaxMinutes;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;
}