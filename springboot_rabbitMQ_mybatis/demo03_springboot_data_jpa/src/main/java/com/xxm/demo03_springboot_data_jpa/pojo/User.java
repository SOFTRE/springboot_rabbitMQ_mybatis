package com.xxm.demo03_springboot_data_jpa.pojo;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @Program: IntelliJ IDEA springboot_demo01
 * @Description: TODO
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-11-11 11:48:30 周一
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: V1.0
 */

/**
 * @Entity：表明为一个实体对象
 * @Table：指定映射的表
 * @Id：指定为主键
 * @GeneratedValue：指定注解的生成策略
 *     TABLE：使用一个特定的数据库表格来保存主键。
 *     SEQUENCE：根据底层数据库的序列来生成主键，条件是数据库支持序列。
 *     IDENTITY：主键由数据库自动生成（主要是自动增长型）
 *     AUTO：主键由程序控制
 *     @Column：指定表的列明
 */
@Entity
@Table(name = "user")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String username;
    private String password;
    private String address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
