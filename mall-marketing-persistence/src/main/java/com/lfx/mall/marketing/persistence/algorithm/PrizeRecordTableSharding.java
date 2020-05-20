package com.lfx.mall.marketing.persistence.algorithm;

import com.lfx.mall.marketing.persistence.algorithm.base.AbstractTableAlgorithm;
import com.lfx.mall.marketing.persistence.algorithm.hash.HashCodingHelper;
import com.lfx.mall.marketing.persistence.algorithm.hash.StringConsistentHashCoding;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-05-20 14:08:17
 */
@Component
public class PrizeRecordTableSharding extends AbstractTableAlgorithm<Integer> {

    @Autowired
    private StringConsistentHashCoding tableHashCoding;

    @Override
    protected Integer resolveIndex(String columnName, Integer value) {
        return HashCodingHelper.tableHashCoding.hashFor(value.toString());
    }
}
