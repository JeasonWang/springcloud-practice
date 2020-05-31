package com.jeason.provider;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${server.port}")
    int port;
    @GetMapping("/hello")
    public String hello(){
        return "hello provider:"+port;
    }
}
