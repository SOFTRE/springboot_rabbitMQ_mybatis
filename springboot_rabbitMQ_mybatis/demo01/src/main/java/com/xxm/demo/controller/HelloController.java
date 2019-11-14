package com.xxm.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Program: IntelliJ IDEA springboot_demo01
 * @Description: TODO
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-11-10 21:56:59 周日
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: V1.0
 */
@RestController
public class HelloController {
    @RequestMapping(value = "/sayHello")
    public String sayHello() {
        return "hello springboot! demo";
    }
}
