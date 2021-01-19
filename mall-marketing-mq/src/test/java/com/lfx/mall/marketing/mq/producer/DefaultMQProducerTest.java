package com.lfx.mall.marketing.mq.producer;

import com.lfx.demo.mq.producer.OrderProducerBeanHelper;
import com.lfx.demo.mq.producer.ProducerBeanHelper;
import com.lfx.mall.marketing.common.util.JacksonUtil;
import com.lfx.mall.marketing.mq.AbstractSpringTest;
import com.lfx.mall.marketing.mq.enums.MQTopicEnum;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-09-08 13:34:26
 */
public class DefaultMQProducerTest extends AbstractSpringTest {

    @Autowired
    private ProducerBeanHelper producerBeanHelper;

    @Autowired(required = false)
    private OrderProducerBeanHelper orderProducerBeanHelper;

    @Test
    public void send() {
        producerBeanHelper.send(MQTopicEnum.TEST, "sendTest", JacksonUtil::toBytes);
    }

    @Test
    public void sendOrder() {
        orderProducerBeanHelper.send(MQTopicEnum.TEST, "sendTest", "shardingKey", JacksonUtil::toBytes);
    }
}
