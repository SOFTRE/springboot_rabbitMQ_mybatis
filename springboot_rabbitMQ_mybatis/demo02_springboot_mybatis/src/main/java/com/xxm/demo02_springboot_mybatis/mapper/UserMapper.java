package com.xxm.demo02_springboot_mybatis.mapper;

import com.xxm.demo02_springboot_mybatis.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Program: IntelliJ IDEA springboot_demo01
 * @Description: TODO
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-11-11 09:18:31 周一
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: V1.0
 */
@Mapper
public interface UserMapper {
    List<User> findAll();
}
