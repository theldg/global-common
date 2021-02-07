package com.ldg.app.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户登录Dto
 *
 * @author ldg
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserLoginDto {
    /**
     * 头像地址
     */
    private String avatarUrl;
    /**
     * 微信code
     */
    private String code;
    /**
     * 微信昵称
     */
    private String wxNickname;
}
