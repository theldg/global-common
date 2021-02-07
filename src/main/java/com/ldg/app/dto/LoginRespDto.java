package com.ldg.app.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 登录响应Dto
 *
 * @author ldg
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LoginRespDto {
    /**
     * token
     */
    private JwtTokenRespDto token;
    /**
     * 用户信息
     */
    private UserRespDto user;
}
