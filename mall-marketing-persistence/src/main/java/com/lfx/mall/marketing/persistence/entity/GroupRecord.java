package com.lfx.mall.marketing.persistence.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-06-08 17:58:03
 */
@TableName("act_group_record")
@Data
public class GroupRecord implements Serializable {

    /**
     * 开团ID
     */
    private String id;

    /**
     * 活动ID
     */
    private Integer activityId;

    /**
     * 商家ID
     */
    private Integer sellerId;

    /**
     * 商家名称
     */
    private String sellerName;

    /**
     * 促销活动商品ID
     */
    private Integer promotionProductId;

    /**
     * 原商品ID
     */
    private Integer productId;

    /**
     * 促销活动货品ID
     */
    private Integer promotionProductGoodsId;

    /**
     * 原货品ID
     */
    private Integer productGoodsId;

    /**
     * 购买单价
     */
    private BigDecimal price;

    /**
     * 购买数量
     */
    private Integer number;

    /**
     * 开团会员ID
     */
    private Integer memberId;

    /**
     * 会员昵称
     */
    private String memberNickName;

    /**
     * 会员头像地址
     */
    private String memberImageUrl;

    /**
     * 订单编号
     */
    private String ordersSn;

    /**
     * 父订单编号
     */
    private String ordersPsn;

    /**
     * 开团状态：2为已开团,3为已成团，4为已失效
     */
    private Integer recordStatus;

    /**
     * 成团人数
     */
    private Integer setupCount;

    /**
     * 参团人数
     */
    private Integer joinCount;

    /**
     * 团过期时间
     */
    private Date setupExpireTime;

    /**
     * 团开始时间，等于订单支付时间
     */
    private Date startTime;

    /**
     * 退团时间
     */
    private Date disjoinTime;

    /**
     * 成团时间
     */
    private Date setupTime;

    /**
     * 成团过期时间，单位分钟（根据最少成团时间-最多成团时间中的随机数获取
     */
    private Integer setupExpireMinutes;

    /**
     * 最少成团时间
     */
    private Integer minGroupMinutes;

    /**
     * 最多成团时间
     */
    private Integer maxGroupMinutes;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 商品名称
     */
    private String productName;

    /**
     * 拼团类型：0普通拼团  1拼团赚
     */
    private Integer groupType;

    /**
     * 拼团赚红包ID
     */
    private String redpacketId;

    /**
     * 原始开团ID
     */
    private String parentId;

    /**
     * 原始开团会员ID
     */
    private Integer parentMemberId;

    /**
     * 红包领取状态：0默认  1待领取  2已领取  3已失效
     */
    private Integer redpacketStatus;

    /**
     * 红包领取失效时间
     */
    private Date redpacketExpireTime;

    /**
     * 退款状态 1、未发生退款 2 已经取消订单退款  3 已经售后退款
     */
    private Integer refundStatus;

    /**
     * 红包拼团瓜分展示金额
     */
    private BigDecimal redEnvelopeShow;

    /**
     * 是否删除：1 正常  2 已删除
     */
    private Integer isDelete;

    /**
     * 是否支持红包：0否 1是
     */
    private Integer isPacket;

    /**
     * 成团时间
     */
    private Date finishTime;

    /**
     * 拼团赚发起标记：0默认  1已发起
     */
    private Integer sendStatus;

    /**
     * 团关闭原因：1库存不足 2成团人数不足 3超过最大成团限制 4创建红包失败 5系统异常
     */
    private Integer closeReason;
}