package com.xxm.demo03_springboot_data_jpa;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.security.RunAs;

@SpringBootTest
@RunWith(SpringRunner.class)
class Demo03SpringbootDataJpaApplicationTests {

    @Test
    void contextLoads() {
        System.out.println("hello");
    }

}
