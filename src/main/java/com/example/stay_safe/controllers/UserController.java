package com.example.stay_safe.controllers;

import com.example.stay_safe.models.User;
import com.example.stay_safe.repositories.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


public class UserController {

    private UserRepository userDao;
    private PasswordEncoder passwordEncoder;

    public UserController(UserRepository userDao, PasswordEncoder passwordEncoder){
        this.userDao = userDao;
        this.passwordEncoder = passwordEncoder;
    }

    @GetMapping("/create")
    public String showRegPage(Model model){
        model.addAttribute("user", new User());
        return "user/create";
    }
    @PostMapping("/create")
    public String saveUser(@ModelAttribute User user){
        String hash = passwordEncoder.encode(user.getPassword());
        user.setPassword(hash);
        userDao.save(user);
        return "redirect:/login";
    }
}
