package com.lfx.mall.marketing.persistence.algorithm;

import com.lfx.mall.marketing.persistence.algorithm.base.AbstractTableAlgorithm;
import com.lfx.mall.marketing.persistence.algorithm.hash.ShardHashHelper;

/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-05-20 14:08:17
 */
public class GroupRecordTableSharding extends AbstractTableAlgorithm<Integer> {

    @Override
    protected Integer resolveIndex(String columnName, Integer value) {
        return ShardHashHelper.tableShardHash.hash(value.toString());
    }
}
