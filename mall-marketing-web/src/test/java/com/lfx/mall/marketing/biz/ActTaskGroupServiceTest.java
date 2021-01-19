package com.lfx.mall.marketing.biz;

import com.lfx.mall.marketing.base.AbstractSpringTest;
import com.lfx.mall.marketing.common.util.JacksonUtil;
import com.lfx.mall.marketing.service.ActTaskGroupService;
import com.lfx.mall.marketing.service.base.request.IdRequest;
import com.lfx.mall.marketing.service.request.ActTaskGroupPageRequest;
import org.apache.dubbo.config.annotation.Reference;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-05-22 14:17:12
 */
public class ActTaskGroupServiceTest extends AbstractSpringTest {

    @Reference
    private ActTaskGroupService actTaskGroupService;

    @BeforeClass
    public static void setup() {
        initSysProperty();
    }

    @Test
    public void get() {
        System.out.println(JacksonUtil.toJsonStr(actTaskGroupService.get(IdRequest.of(1)), true));
    }

    @Test
    public void page() {
        ActTaskGroupPageRequest request = readJsonFile("group-page.json", ActTaskGroupPageRequest.class);
        System.out.println(JacksonUtil.toJsonStr(actTaskGroupService.page(request), true));
    }

}
