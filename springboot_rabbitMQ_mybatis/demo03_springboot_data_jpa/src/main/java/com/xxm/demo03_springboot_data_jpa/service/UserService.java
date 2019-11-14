package com.xxm.demo03_springboot_data_jpa.service;

import com.xxm.demo03_springboot_data_jpa.pojo.User;

import java.util.List;

/**
 * @Program: IntelliJ IDEA springboot_demo01
 * @Description: TODO
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-11-11 11:55:50 周一
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: V1.0
 */
public interface UserService {
    List<User> findUsers();

    User findUserById(Integer id);

    void saveUser(User user);

    void updateUser(User user);

    void deleteUserById(Integer id);
}
