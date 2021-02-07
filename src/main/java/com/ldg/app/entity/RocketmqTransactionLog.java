package com.ldg.app.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * RocketMQ事务日志表(RocketmqTransactionLog)实体类
 *
 * @author makejava
 * @since 2021-01-20 18:34:57
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RocketmqTransactionLog implements Serializable {
    private static final long serialVersionUID = -34686967454447041L;
    /**
    * id
    */
    private Integer id;
    /**
    * 事务id
    */
    private String transactionId;
    /**
    * 日志
    */
    private String log;



}