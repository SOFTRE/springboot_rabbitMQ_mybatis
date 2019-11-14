package com.xxm.demo03_springboot_data_jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Demo03SpringbootDataJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demo03SpringbootDataJpaApplication.class, args);
    }

}
