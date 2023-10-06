package com.lion.usercenter.model.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 * @description: 用户登录请求实体类
 */
@Data
public class UserLoginRequest implements Serializable {

    private static final long serialVersionUID = -4385203694576421054L;

    private String userAccount;

    private String userPassword;

    private String checkPassword;
}
