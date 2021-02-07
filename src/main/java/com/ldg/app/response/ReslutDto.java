package com.ldg.app.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ldg
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ReslutDto {
    private Integer code;
    private String msg;
    private Object data;

}
