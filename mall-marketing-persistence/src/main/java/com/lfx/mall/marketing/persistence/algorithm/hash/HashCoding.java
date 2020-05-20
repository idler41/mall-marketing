package com.lfx.mall.marketing.persistence.algorithm.hash;

/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-05-20 09:54:46
 */
public interface HashCoding<T> {
    int hashFor(T v);
}
