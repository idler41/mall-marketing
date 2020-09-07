package com.lfx.mall.marketing.web.request;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-09-03 10:25:31
 */
@Data
public class SpuGroupQueryWebRequest implements Serializable {

    /**
     * 活动id
     */
    @NotNull
    private Integer actId;

    /**
     * spuId
     */
    @NotNull
    private Integer spuId;
}
