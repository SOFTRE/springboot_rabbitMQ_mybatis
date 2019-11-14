package com.xxm.demo02_springboot_mybatis.service.impl;

import com.xxm.demo02_springboot_mybatis.mapper.UserMapper;
import com.xxm.demo02_springboot_mybatis.pojo.User;
import com.xxm.demo02_springboot_mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Program: IntelliJ IDEA springboot_demo01
 * @Description: TODO
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-11-11 10:22:27 周一
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: V1.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Autowired
    private RedisTemplate redisTemplate;
    @Override
    public List<User> findAll() {
        String key="UserList";
      List<User> users=  (List<User>)redisTemplate.boundValueOps(key).get();
        if (users != null) {
            return users;
        }
        users=userMapper.findAll();
        redisTemplate.boundValueOps(key).set(users);
        return users;
    }
}
