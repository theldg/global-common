package com.ldg.app.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * (Notice)实体类
 *
 * @author makejava
 * @since 2021-01-20 18:33:40
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Notice implements Serializable {
    private static final long serialVersionUID = -71797263579969573L;
    /**
    * id
    */
    private Integer id;
    /**
    * 内容
    */
    private String content;
    /**
    * 是否显示 0:否 1:是
    */
    private Integer showFlag;
    /**
    * 创建时间
    */
    private Date createTime;



}