package com.lfx.mall.marketing.persistence.algorithm;

import com.lfx.mall.marketing.persistence.algorithm.base.AbstractDbAlgorithm;
import com.lfx.mall.marketing.persistence.algorithm.hash.ShardHashHelper;

public class GroupShoppingMemberDBSharding extends AbstractDbAlgorithm<String> {

    @Override
    protected Integer resolveIndex(String columnName, String value) {
        return ShardHashHelper.databaseShardHash.hash(value);
    }
}
