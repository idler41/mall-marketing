package com.lfx.mall.marketing.persistence.algorithm.base;

import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

import java.util.Collection;

/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-05-18 18:58:49
 */
public abstract class AbstractTableAlgorithm<T extends Comparable<?>> implements PreciseShardingAlgorithm<T> {

    /**
     * datasource 前缀
     */
    private static final String TABLE_SEPARATOR = "_";

    @Override
    public String doSharding(Collection<String> availableTargetNames, PreciseShardingValue<T> shardingValue) {
        return shardingValue.getLogicTableName() + TABLE_SEPARATOR + resolveIndex(shardingValue.getColumnName(), shardingValue.getValue());
    }

    /**
     * 根据value解析数据源下标
     * @param columnName 列名
     * @param value 列值
     * @return 数据源下标
     */
    protected abstract Integer resolveIndex(String columnName, T value);
}
