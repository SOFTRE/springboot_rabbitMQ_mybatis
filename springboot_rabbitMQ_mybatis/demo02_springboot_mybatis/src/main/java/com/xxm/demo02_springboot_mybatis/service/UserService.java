package com.xxm.demo02_springboot_mybatis.service;

import com.xxm.demo02_springboot_mybatis.pojo.User;

import java.util.List;

/**
 * @Program: IntelliJ IDEA springboot_demo01
 * @Description: TODO
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-11-11 10:21:27 周一
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: V1.0
 */
public interface UserService {
    List<User> findAll();
}
