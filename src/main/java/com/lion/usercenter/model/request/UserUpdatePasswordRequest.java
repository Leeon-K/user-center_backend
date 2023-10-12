package com.lion.usercenter.model.request;

import lombok.Data;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Lion
 * @Date: 2023/10/12/19:15
 * @Description:
 */
@Data
public class UserUpdatePasswordRequest implements Serializable {

    private static final long serialVersionUID = -5996345129538944393L;

    /**
     * 原密码
     */
    private String userPassword;

    /**
     * 新密码
     */
    private String newPassword;
}
