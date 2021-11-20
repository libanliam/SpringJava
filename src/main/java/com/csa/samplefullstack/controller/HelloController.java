package com.csa.samplefullstack.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1")
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "This message is from spring boot!";
    }
}
