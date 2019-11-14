package com.xxm.demo03_springboot_data_jpa.service.impl;

import com.xxm.demo03_springboot_data_jpa.dao.UserDao;
import com.xxm.demo03_springboot_data_jpa.pojo.User;
import com.xxm.demo03_springboot_data_jpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @Program: IntelliJ IDEA springboot_demo01
 * @Description: TODO
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-11-11 11:57:01 周一
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: V1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findUsers() {
        return userDao.findAll();
    }

    @Override
    public User findUserById(Integer id) {
        Optional<User> optional = userDao.findById(id);
        return optional.get();
    }

    @Override
    public void saveUser(User user) {
        userDao.save(user);
    }

    @Override
    public void updateUser(User user) {
        // 并没有update方法，如果id存在则执行更新操作
        userDao.save(user);
    }

    @Override
    public void deleteUserById(Integer id) {
        userDao.deleteById(id);
    }
}
