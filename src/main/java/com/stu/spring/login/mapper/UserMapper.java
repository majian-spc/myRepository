package com.stu.spring.login.mapper;

import com.stu.spring.login.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName UserMapper
 * @Description TODO
 * @Author majian-spc
 * @Date 2020/7/22 9:56
 * @Version 1.0
 */
@Mapper
public interface UserMapper {

    //根据姓名和密码查询用户
    public User findUser(@Param("username")String username, @Param("password")String password);
}
