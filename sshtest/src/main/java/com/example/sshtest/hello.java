package com.example.sshtest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class hello {

    @GetMapping("/hello")
    public String sayHello(){
        return "hello";
    }

}
