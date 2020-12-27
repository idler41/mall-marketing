package com.lfx.mall.marketing.persistence.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.io.Serializable;
import java.util.Date;

/**
 * @author <a href="mailto:idler41@163.con">idler41</a>
 * @date 2020-12-27 15:47:13
 */
@TableName("t_group_shopping_member")
@Data
public class GroupShoppingMember implements Serializable {

    /**
     * 参团id
     */
    private String id;

    /**
     * 开团id
     */
    private String groupId;

    /**
     * 团成员用户id
     */
    private Integer memberId;

    /**
     * 会员昵称
     */
    private String memberNickName;

    /**
     * 会员头像地址
     */
    private String memberAvatar;

    /**
     * 团成员类型：0-团长，1-普通成员
     */
    private Integer memberType;

    /**
     * 订单编号
     */
    private String orderSn;

    /**
     * 订单父编号
     */
    private String orderPsn;

    /**
     * 订单付款时间
     */
    private Date orderPayTime;

    /**
     * 活动货品id
     */
    private Integer actSkuId;

    /**
     * 购买单价
     */
    private Long price;

    /**
     * 购买数量
     */
    private Integer number;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;
}