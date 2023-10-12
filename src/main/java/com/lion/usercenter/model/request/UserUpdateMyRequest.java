package com.lion.usercenter.model.request;


import lombok.Data;

import java.io.Serializable;
/**
 * Created with IntelliJ IDEA.
 * 用户更新个人信息请求
 * @Author: Lion
 * @Date: 2023/10/12/19:15
 * @Description:
 */
@Data
public class UserUpdateMyRequest implements Serializable {

    /**
     * 用户名
     */
    private String username;

    /**
     * 账号
     */
    private String userAccount;

    /**
     * 用户头像
     */
    private String avatarUrl;

    /**
     * 性别 男 女
     */
    private String gender;

    /**
     * 电话
     */
    private String phone;

    /**
     * 邮箱
     */
    private String email;

    /**
     * vipCode
     */
    private String vipCode;


    private static final long serialVersionUID = 1L;
}
