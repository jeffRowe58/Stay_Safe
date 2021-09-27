package com.example.stay_safe.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthenticationController {
    @GetMapping("/index")
    public String showLoginForm() {
        return "/index";
    }
}
