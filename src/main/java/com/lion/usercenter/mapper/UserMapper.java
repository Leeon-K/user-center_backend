package com.lion.usercenter.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lion.usercenter.model.domain.User;
import org.apache.ibatis.annotations.Mapper;

/**
* @author Lick
* @description 针对表【user(用户)】的数据库操作Mapper
* @createDate 2023-10-06 09:03:28
* @Entity generator.domain.User
*/
// 没有MAPPER注解，会报错,因为没有实现类
@Mapper
public interface UserMapper extends BaseMapper<User> {

}




