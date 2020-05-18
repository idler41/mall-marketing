package com.lfx.mall.marketing.persistence.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.io.Serializable;
import java.util.Date;

/**
 * @author <a href="mailto:idler41@163.con">idler41</a>
 * @date 2020-05-17 16:01:31
 */
@TableName("t_task_log")
@Data
public class TaskLog implements Serializable {

    /**
     *  自增长主键
     */
    private Integer id;

    /**
     *  任务类型
     */
    private Integer taskType;

    /**
     *  逻辑表名
     */
    private String logicTableName;

    /**
     *  库下标
     */
    private Integer dbIndex;

    /**
     *  表下标
     */
    private Integer tableIndex;

    /**
     *  执行开始时间
     */
    private Long startTime;

    /**
     *  执行结束时间
     */
    private Long endTime;

    /**
     *  创建时间
     */
    private Date createTime;

    /**
     *  更新时间
     */
    private Date updateTime;
}