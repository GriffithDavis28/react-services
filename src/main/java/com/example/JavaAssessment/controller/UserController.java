package com.example.JavaAssessment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.JavaAssessment.models.Users;
import com.example.JavaAssessment.services.UserService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<Users> getAllUsers() {
        return userService.getUsers();
    }

    @GetMapping("/{id}")
    public Users getUserById(@PathVariable String id) {
        return userService.getUserById(id);
    }

    @PostMapping
    public Users createUser(@RequestBody Users user){
        return userService.createUser(user);
    }
}
