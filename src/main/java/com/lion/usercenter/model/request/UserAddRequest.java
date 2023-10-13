package com.lion.usercenter.model.request;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Lion
 * @Date: 2023/10/12/20:53
 * @Description:
 */

import lombok.Data;

/**
 * 用户创建请求
 *
 */
@Data
public class UserAddRequest {
    /**
     * 用户昵称
     */
    private String username;

    /**
     * 账号
     */
    private String userAccount;

    /**
     * 账号
     */
    private String userPassword;

    /**
     * 用户头像
     */
    private String avatarUrl;

    /**
     * 用户编号
     */
    private String vipCode;

    /**
     * 用户角色: user, admin
     */
    private String userrole;

    /**
     * 电话
     */
    private String phone;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 性别
     */
    private String gender;

    private static final long serialVersionUID = 1L;

}
