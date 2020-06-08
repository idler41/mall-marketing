package com.lfx.mall.marketing.common.util;

import lombok.experimental.UtilityClass;
import net.sf.cglib.beans.BeanCopier;
import net.sf.cglib.core.Converter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-05-13 11:20:05
 */
@UtilityClass
public class CachedBeanCopier {
    private final Map<String, BeanCopier> BEAN_COPIERS = new HashMap<>();
    private final String KEY_SPLICE = "-";

    public <S, T> BeanCopier registerToCache(Class<S> sourceClass, Class<T> targetClass) {
        String key = genKey(sourceClass, targetClass);
        BeanCopier copier = null;
        if (!BEAN_COPIERS.containsKey(key)) {
            copier = BeanCopier.create(sourceClass, targetClass, false);
            BEAN_COPIERS.put(key, copier);
        } else {
            copier = BEAN_COPIERS.get(key);
        }
        return copier;
    }

    public <S, T> T copy(S source, Class<T> targetClazz) {
        return copy(source, targetClazz, null);
    }

    public <S, T> T copy(S source, Class<T> targetClazz, Converter converter) {
        if (source == null || targetClazz == null) {
            return null;
        }
        T instance;
        try {
            instance = targetClazz.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return registerAndCopy(source, instance, converter);
    }

    private <S, T> T registerAndCopy(S source, T target, Converter converter) {
        BeanCopier copier = registerToCache(source.getClass(), target.getClass());
        copier.copy(source, target, converter);
        return target;
    }

    private String genKey(Class<?> sourceClass, Class<?> targetClass) {
        return sourceClass.getName() + KEY_SPLICE + targetClass.getName();
    }

}
