package com.xxm.springboot.controller;

import com.xxm.springboot.pojo.MyInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Program: IntelliJ IDEA springboot_demo01
 * @Description: TODO
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-11-10 20:39:54 周日
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: V1.0
 */
@RestController
public class TestController {
    @RequestMapping(value = "/sayHello")
    public String sayHello(){
        return "hello world";
    }
    @Value("${my.url}")
    private String url;
    @Value("${my.port}")
    private String port;
    @Value("${my.address}")
    private String address;
    @Autowired
    private Environment environment;
    @Autowired
    private MyInfo myInfo;
    @Value("${myservers}")
    private String[] myservers;
    @RequestMapping(value = "/test")
    public String tests(){
        System.out.println("获取properties中的值："+url);
        System.out.println("获取properties中的值："+port);
        System.out.println("获取properties中的值："+address);
        System.out.println(environment.getProperty("my.port"));
        System.out.println(environment.getProperty("my.url"));
        System.out.println(environment.getProperty("my.address"));
        System.out.println(myInfo.getPort());
        System.out.println(myInfo.getUrl());
        System.out.println(myInfo.getAddress());
        System.out.println("====================================");
        for (String myserver : myservers) {
            System.out.println(myserver);
        }
        System.out.println("====================================");
        List<String> myservers2 = myInfo.getMyservers2();
        System.out.println(myservers2);

        return "hello world111";
    }
}
