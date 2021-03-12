package com.stu.spring.login.pojo;

import org.springframework.util.StringUtils;

import java.io.Serializable;

/**
 * @ClassName User
 * @Description TODO
 * @Author majian-spc
 * @Date 2020/7/22 9:54
 * @Version 1.0
 */
public class User implements Serializable {

    private int id;
    private String username;
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
