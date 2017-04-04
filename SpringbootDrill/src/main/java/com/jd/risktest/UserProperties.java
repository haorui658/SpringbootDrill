package com.jd.risktest;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by gooo on 2017/4/4.
 */
@Component
@ConfigurationProperties(prefix = "user")
public class UserProperties {


    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    private String sname;
    private Integer age;
}
