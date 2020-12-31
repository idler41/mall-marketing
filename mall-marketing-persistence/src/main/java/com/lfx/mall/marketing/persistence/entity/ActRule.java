package com.lfx.mall.marketing.persistence.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.io.Serializable;
import java.util.Date;

/**
 * @author <a href="mailto:idler41@163.con">idler41</a>
 * @date 2020-12-31 15:11:49
 */
@TableName("t_act_rule")
@Data
public class ActRule implements Serializable {

    /**
     * 活动规则id
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