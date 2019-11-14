package com.xxm.demo03_springboot_data_jpa.dao;

import com.xxm.demo03_springboot_data_jpa.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Program: IntelliJ IDEA springboot_demo01
 * @Description: TODO
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-11-11 11:54:45 周一
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: V1.0
 */
public interface UserDao extends JpaRepository<User,Integer> {
}
