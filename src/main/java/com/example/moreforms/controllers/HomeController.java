package com.example.moreforms.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    @PostMapping("/")
    public String home() {
        return "home/index";
    }
}
