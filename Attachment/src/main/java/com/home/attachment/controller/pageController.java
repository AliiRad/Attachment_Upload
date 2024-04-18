package com.home.attachment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class pageController {
    @GetMapping("/")
    public String indexPage(){
        return "index";
    }
}
