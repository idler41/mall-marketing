package com.lfx.mall.marketing.persistence.algorithm;

import com.lfx.mall.marketing.persistence.algorithm.base.AbstractTableAlgorithm;
import com.lfx.mall.marketing.persistence.algorithm.hash.ShardHashHelper;

public class GroupShoppingMemberTableSharding extends AbstractTableAlgorithm<String> {

    @Override
    protected Integer resolveIndex(String columnName, String value) {
        return ShardHashHelper.tableShardHash.hash(value);
    }
}
