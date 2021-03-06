package com.lfx.mall.marketing.service.base.request;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-05-22 10:51:39
 */
@Data
@ToString(callSuper = true)
@NoArgsConstructor
@RequiredArgsConstructor(staticName = "of")
public class KeyRequest<T> implements Serializable {
    @NonNull
    @NotNull
    private T value;
}
