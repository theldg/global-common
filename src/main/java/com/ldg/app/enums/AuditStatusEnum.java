package com.ldg.app.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 审核枚举
 *
 * @author ldg
 */
@Getter
@AllArgsConstructor
public enum AuditStatusEnum {
    NotYet("待审核"), Pass("通过"), Reject("拒绝");
    private String content;
}
