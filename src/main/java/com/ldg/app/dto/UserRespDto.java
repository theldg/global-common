package com.ldg.app.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户响应Dto
 *
 * @author ldg
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserRespDto {
    /**
     * 头像地址
     */
    private String avatarUrl;
    /**
     * 积分明细
     */
    private Integer bonus;
    /**
     * 用户id
     */
    private Integer id;
    /**
     * 微信昵称
     */
    private String wxNickname;
}
