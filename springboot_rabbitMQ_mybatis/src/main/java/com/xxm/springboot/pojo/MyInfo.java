package com.xxm.springboot.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;

/**
 * @Program: IntelliJ IDEA springboot_demo01
 * @Description: TODO
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-11-10 22:35:42 周日
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: V1.0
 */
@ConfigurationProperties(prefix = "my")
@Component
public class MyInfo implements Serializable {
    private String port;
    private String url;
    private String address;
    private List<String> myservers2;

    public List<String> getMyservers2() {
        return myservers2;
    }

    public void setMyservers2(List<String> myservers2) {
        this.myservers2 = myservers2;
    }
//private String[] myservers2;

    /*public String[] getMyservers2() {
        return myservers2;
    }

    public void setMyservers2(String[] myservers2) {
        this.myservers2 = myservers2;
    }*/

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
