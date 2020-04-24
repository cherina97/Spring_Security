package com.example.Spring.Security.controllers;

import com.example.Spring.Security.dtos.UserRegisterRequest;
import com.example.Spring.Security.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/new")
    public String newUser(HttpServletRequest req) {
        return "registration";
    }

    @PostMapping("/registration")
    public String createNew (HttpServletRequest request, @ModelAttribute UserRegisterRequest userRegisterRequest){
        userService.save(userRegisterRequest);
        return "login";
    }
}
