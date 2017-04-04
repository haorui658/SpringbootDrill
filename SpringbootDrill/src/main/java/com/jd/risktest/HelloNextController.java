package com.jd.risktest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gooo on 2017/4/4.
 */
@Controller
public class HelloNextController {

    @Autowired
    UserProperties age;

    @RequestMapping(value = "hellonext", method = RequestMethod.GET)
    public String say() {

        return "index";
    }
}
