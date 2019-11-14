package com.xxm.demo02_springboot_mybatis.controller;

import com.xxm.demo02_springboot_mybatis.pojo.User;
import com.xxm.demo02_springboot_mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Program: IntelliJ IDEA springboot_demo01
 * @Description: TODO
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-11-11 10:23:43 周一
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: V1.0
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping(value = "/findAll")
    public List<User> findAll(){
return userService.findAll();
    }
}
