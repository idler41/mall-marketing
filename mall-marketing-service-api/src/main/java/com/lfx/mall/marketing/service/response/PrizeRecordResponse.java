package com.lfx.mall.marketing.service.response;

import lombok.Data;

import java.io.Serializable;

/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-05-22 14:18:08
 */
@Data
public class PrizeRecordResponse implements Serializable {
    /**
     * 自增id
     */
    private Integer id;

    /**
     * 活动id
     */
    private Integer actId;

    /**
     * 奖品id
     */
    private Integer prizeId;

    /**
     * 奖品类型
     */
    private Integer prizeType;

    /**
     * 会员id
     */
    private Integer memberId;

    /**
     * 奖品数量
     */
    private Integer num;

    /**
     * 奖品金额(单位分)
     */
    private Integer money;

    /**
     * 奖品状态： 0-未领取 1-已领取 2-已发放 3-失效 4-发放失败
     */
    private Integer receiveStatus;

    /**
     * 拓展ID(优惠券ID等)
     */
    private String extId;

    /**
     * 备注
     */
    private String memo;

    /**
     * 业务编号(交易ID等)
     */
    private String bizNo;

    /**
     * 扩展字段，存放发放失败时的奖品信息
     */
    private String extra;
}
