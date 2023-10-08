package com.lion.usercenter.model.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 * @description: 用户注册请求实体类
 */
@Data
public class UserRegisterRequest implements Serializable {

    private static final long serialVersionUID = -4385203694576421054L;

    private String userAccount;

    private String userPassword;

    private String checkPassword;

    private String vipCode;
}
