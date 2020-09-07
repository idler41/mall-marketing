package com.lfx.mall.marketing.persistence.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.io.Serializable;
import java.util.Date;

/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-09-03 16:48:17
 */
@TableName("t_group_finish_log")
@Data
public class GroupFinishLog implements Serializable {

    /**
     * 
     */
    private Integer id;

    /**
     * 活动商品id
     */
    private Integer actSpuId;

    /**
     * 开团id
     */
    private String groupId;

    /**
     * 拼团完成时间
     */
    private Date finishTime;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;
}