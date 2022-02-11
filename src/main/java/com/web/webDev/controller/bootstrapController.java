package com.web.webDev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class bootstrapController {

    @GetMapping("/")
    public String main(){
        return "index";
    }

    @GetMapping("/register")
    public String register() {
        return "register";
    }


}
