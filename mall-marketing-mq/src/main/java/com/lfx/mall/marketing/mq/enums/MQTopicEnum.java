package com.lfx.mall.marketing.mq.enums;

import com.lfx.demo.mq.enums.MQTopic;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-09-08 13:37:39
 */
@AllArgsConstructor
@Getter
public enum MQTopicEnum implements MQTopic {
    TEST("topic_task_order", "*", "测试topic"),
    ;
    String topic;
    String tag;
    String desc;
}
