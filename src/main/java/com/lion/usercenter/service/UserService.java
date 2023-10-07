package com.lion.usercenter.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lion.usercenter.model.domain.User;

import javax.servlet.http.HttpServletRequest;

/**
* @author Lick
* @description 针对表【user(用户)】的数据库操作Service
* @createDate 2023-10-06 09:03:28
*/
public interface UserService extends IService<User> {
    /**
     * 用户注册
     * @param userAccount 用户账号
     * @param userPassword 用户密码
     * @param checkPassword 确认密码
     * @return
     */
    long userRegister(String userAccount, String userPassword, String checkPassword, String userMail);

    /**
     * 用户登录
     * @param userAccount
     * @param userPassword
     * @param request
     * @return
     */
    User userLogin(String userAccount, String userPassword, HttpServletRequest request);
    /**
     * 用户登出
     * @param request
     * @return
     */
    int userLogout(HttpServletRequest request);
    /**
     * 用户脱敏
     */
    User getSafetyUser(User user);
}
