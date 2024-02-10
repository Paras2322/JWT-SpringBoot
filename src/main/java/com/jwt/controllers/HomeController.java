package com.jwt.controllers;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.models.User;
import com.jwt.services.UserService;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private UserService userService;

    // http://localhost:4141/home/user
    @GetMapping("/users")
    public List<User> getUser() {
        System.out.println("getting users");
        return this.userService.getUsers();
    }
    
    @GetMapping("/current-user")
    public String getLoggedInUser(Principal principal){
        return principal.getName();
    }
}