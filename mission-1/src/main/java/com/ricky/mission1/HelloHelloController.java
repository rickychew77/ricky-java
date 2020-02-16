package com.ricky.mission1;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@EnableAutoConfiguration
public class HelloHelloController {
    @RequestMapping("/hello")
    @ResponseBody
    public String sayHello() {
        return "Hello Hello";
    }
}
