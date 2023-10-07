package com.lion.usercenter.service;

import com.lion.usercenter.model.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Date;

@SpringBootTest
class UserServiceTest {
    @Resource
    private UserService userService;

    @Test
    public void testAddUser() {
        User user = new User();
        user.setId(0L);
        user.setUserAccount("domin");
        user.setAvatarUrl("https://tse3-mm.cn.bing.net/th/id/OIP-C.3Pfd2kdG6S8b0JBZefXR6gAAAA?pid=ImgDet&rs=1");
        user.setGender(0);
        user.setUserPassword("123456");
        user.setPhone("123");
        user.setEmail("345");
        user.setUserStatus(0);
        user.setCreatetime(new Date());
        user.setUpdatetime(new Date());
        user.setIsDelete(0);
        user.setUsername("");
        boolean result = userService.save(user);

        System.out.println(user.getId());
        Assertions.assertTrue(result);
    }

    @Test
    void userRegister() {
        String userAccount = "admin2";
        String userPassword = "123456789";
        String checkPassword = "123456789";
//        long result = userService.userRegister(userAccount, userPassword, checkPassword);
//        Assertions.assertEquals(3, result);
//        userAccount = "11";
//        result = userService.userRegister(userAccount, userPassword, checkPassword);
//        Assertions.assertEquals(-2, result);
//        userAccount = "admin3";
//        userPassword = "123";
//        result = userService.userRegister(userAccount, userPassword, checkPassword);
//        Assertions.assertEquals(-3, result);

    }
}