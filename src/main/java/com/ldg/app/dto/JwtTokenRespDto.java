package com.ldg.app.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Jwt响应Dto
 *
 * @author ldg
 */
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JwtTokenRespDto {
    /**
     * token
     */
    private String token;
    /**
     * 过期时间
     */
    private Long expirationTime;
}
