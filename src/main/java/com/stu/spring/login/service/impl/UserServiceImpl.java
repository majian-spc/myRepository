package com.stu.spring.login.service.impl;

import com.stu.spring.login.mapper.UserMapper;
import com.stu.spring.login.pojo.User;
import com.stu.spring.login.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author majian-spc
 * @Date 2020/7/22 10:08
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findUser(User uer) {
        User u = this.userMapper.findUser(uer.getUsername(),uer.getPassword());
        return u;
    }
}
