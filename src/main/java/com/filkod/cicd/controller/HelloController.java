package com.filkod.cicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String welcome(){
        return "Hallo, this is my the first time implemented CICD with GitHub Actions";
    }
}
