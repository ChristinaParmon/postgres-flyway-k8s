package com.example.k8s.springbootpostgresk8s.controller;

import com.example.k8s.springbootpostgresk8s.dto.UserDto;
import com.example.k8s.springbootpostgresk8s.entity.User;
import com.example.k8s.springbootpostgresk8s.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    @PostMapping
    public User save(UserDto user){
        return userService.save(user);
    }

    @GetMapping
    public Iterable<User> getAll(){
        return userService.getAll();
    }
}

