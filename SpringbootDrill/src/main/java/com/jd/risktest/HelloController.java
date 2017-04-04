package com.jd.risktest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gooo on 2017/4/4.
 */
@RestController
public class HelloController {

    @Autowired
    UserProperties age;

    @RequestMapping(value = {"hello", "hi"}, method = RequestMethod.GET)
    public String say() {
        return "Hello Spring boot!" + age.getSname() + age.getAge();
    }
}
