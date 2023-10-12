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
    private String userRole;

    private static final long serialVersionUID = 1L;

}
