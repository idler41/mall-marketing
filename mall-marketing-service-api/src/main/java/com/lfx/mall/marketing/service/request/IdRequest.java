package com.lfx.mall.marketing.service.request;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-05-22 10:51:39
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@RequiredArgsConstructor(staticName = "of")
public class IdRequest<T> extends Request {
    @NonNull
    private T value;
}
