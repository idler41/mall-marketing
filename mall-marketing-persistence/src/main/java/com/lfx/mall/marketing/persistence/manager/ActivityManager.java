package com.lfx.mall.marketing.persistence.manager;

import com.alicp.jetcache.anno.CacheType;
import com.alicp.jetcache.anno.Cached;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lfx.mall.marketing.persistence.cache.CacheConstants;
import com.lfx.mall.marketing.persistence.dao.ActivityMapper;
import com.lfx.mall.marketing.persistence.entity.Activity;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * @author <a href="mailto:idler41@163.con">idler41</a>
 * @date 2020-12-31 15:11:49
 */
@Service
public class ActivityManager extends ServiceImpl<ActivityMapper, Activity> {

    @Cached(name = CacheConstants.ActivityCache.CACHE_NAME, key = "#id", cacheType = CacheType.BOTH, expire = 1800, localExpire = 5)
    @Override
    public Activity getById(Serializable id) {
        return super.getById(id);
    }
}