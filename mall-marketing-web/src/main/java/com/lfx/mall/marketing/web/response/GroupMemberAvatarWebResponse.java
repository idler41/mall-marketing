package com.lfx.mall.marketing.web.response;

import lombok.Data;

import java.io.Serializable;

/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-09-03 10:18:25
 */
@Data
public class GroupMemberAvatarWebResponse implements Serializable {

    /**
     * 用户ID
     */
    private Integer memberId;

    /**
     * 用户昵称
     */
    private String memberNickName;

    /**
     * 用户头像
     */
    private String memberAvatar;

    /**
     * 团成员类型: 0-团员 1-团长
     */
    private Integer groupMemberType;
}
