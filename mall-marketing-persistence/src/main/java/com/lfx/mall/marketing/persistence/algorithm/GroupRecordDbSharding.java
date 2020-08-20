package com.lfx.mall.marketing.persistence.algorithm;

import com.lfx.mall.marketing.persistence.algorithm.base.AbstractDbAlgorithm;
import com.lfx.mall.marketing.persistence.algorithm.hash.ShardHashHelper;

/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-05-20 14:08:17
 */
public class GroupRecordDbSharding extends AbstractDbAlgorithm<Integer> {

    @Override
    protected Integer resolveIndex(String columnName, Integer value) {
        return ShardHashHelper.databaseShardHash.hash(value.toString());
    }
}
