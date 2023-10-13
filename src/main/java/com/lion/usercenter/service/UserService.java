package com.lion.usercenter.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lion.usercenter.model.domain.User;
import com.lion.usercenter.model.request.UserSearchRequest;
import com.lion.usercenter.model.request.UserUpdatePasswordRequest;

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
     * @param vipCode vip码
     * @return
     */
    long userRegister(String userAccount, String userPassword, String checkPassword, String vipCode);

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
     *
     * @param request
     * @return
     */
    int userLogout(HttpServletRequest request);
    /**
     * 用户脱敏
     */
    User getSafetyUser(User user);

    /**
     * 当前用户登录状态
     * @param request
     * @return
     */
    User getLoginUser(HttpServletRequest request);

    /**
     * 用户信息修改
     * @param user
     * @return
     */
    int userUpdate(User user, HttpServletRequest request);

    boolean updatePassword(UserUpdatePasswordRequest updatePasswordRequest, HttpServletRequest request);

    /**
     * 分页条件
     * @param searchRequest
     * @return
     */
    QueryWrapper<User> getQueryWrapper(UserSearchRequest searchRequest);

}
