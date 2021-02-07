package com.ldg.app.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * 积分变更记录表(BonusEventLog)实体类
 *
 * @author ldg
 * @since 2021-01-20 16:51:03
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BonusEventLog implements Serializable {
    private static final long serialVersionUID = -30641638310808520L;
    /**
    * Id
    */
    private Integer id;
    /**
    * user.id
    */
    private Integer userId;
    /**
    * 积分操作值
    */
    private Integer value;
    /**
    * 发生的事件
    */
    private String event;
    /**
    * 创建时间
    */
    private Date createTime;
    /**
    * 描述
    */
    private String description;



}