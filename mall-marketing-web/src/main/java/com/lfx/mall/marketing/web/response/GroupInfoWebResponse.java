package com.lfx.mall.marketing.web.response;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-09-03 09:53:11
 */
@Data
public class GroupInfoWebResponse implements Serializable {

    /**
     * 团id
     */
    private String id;

    /**
     * 开团订单编号
     */
    private String groupLeaderOrderSn;

    /**
     * 活动id
     */
    private Integer actId;

    /**
     * 团类型: 0-普通拼团 1-拼团赚
     */
    private Integer groupType;

    /**
     * 是否有红包: 0-否 1-是
     */
    private Integer hasRedPacket;

    /**
     * 成团人数
     */
    private Integer groupMemberSize;

    /**
     * 参团人数
     */
    private Integer groupMemberAmount;

    /**
     * 团状态: 0-待成团 1-已成团 2-已失效
     */
    private Integer groupStatus;

    /**
     * 团长用户id
     */
    private Integer groupLeaderMemberId;

    /**
     * 团长用户昵称
     */
    private String groupLeaderNickname;

    /**
     * 团过期时间
     */
    private Date groupExpireTime;

    /**
     * 瓜分红包金额总数（单位：分）
     */
    private Integer redPacketMoney;

    /**
     * 团成员列表
     */
    private List<GroupMemberAvatarWebResponse> groupMemberList;
}
