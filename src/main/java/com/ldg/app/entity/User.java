package com.ldg.app.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * 分享(User)实体类
 *
 * @author ldg
 * @since 2021-01-20 16:50:16
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    private static final long serialVersionUID = 173368559468297875L;
    /**
    * Id
    */
    private Integer id;
    /**
    * 微信id
    */
    private String wxId;
    /**
    * 微信昵称
    */
    private String wxNickname;
    /**
    * 角色
    */
    private String roles;
    /**
    * 头像地址
    */
    private String avatarUrl;
    /**
    * 创建时间
    */
    private Date createTime;
    /**
    * 修改时间
    */
    private Date updateTime;
    /**
    * 积分
    */
    private Integer bonus;



}