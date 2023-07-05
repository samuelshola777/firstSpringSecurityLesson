package com.example.securityMaven.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class testController {
@GetMapping("/")
    public String testController(){
        return "my name is  samuel shola";
    }

}
