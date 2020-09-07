package com.lfx.mall.marketing.persistence.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.io.Serializable;

/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-09-03 16:48:17
 */
@TableName("t_activity_rule")
@Data
public class ActivityRule implements Serializable {

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