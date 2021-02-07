package com.ldg.app.dto;


import com.ldg.app.enums.AuditStatusEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 审核Dto
 *
 * @author ldg
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ShareAuditDto {
    /**
     * 审核原因
     */
    private String reason;
    /**
     * 审核状态
     */
    private AuditStatusEnum auditStatusEnum;
}
