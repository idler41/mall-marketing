package com.lfx.mall.marketing.service.response;

import lombok.Data;

import java.io.Serializable;

/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-09-03 16:48:17
 */
@Data
public class ActivityRuleResponse implements Serializable {

    /**
     *
     */
    private Integer id;

    /**
     * 活动id
     */
    private Integer actId;

    /**
     * 活动规则json
     */
    private String ruleJson;
}