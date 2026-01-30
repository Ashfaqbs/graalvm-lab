package com.example.demo.controller;

import com.example.demo.model.UserEntity;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserRepository userRepository;
    private final String greeting;

    public UserController(
            UserRepository userRepository,
            @Value("Hello") String greeting) {
        this.userRepository = userRepository;
        this.greeting = greeting;
    }

    @GetMapping
    public List<UserEntity> findAll() {
        return userRepository.findAll();
    }

    @GetMapping("/greeting")
    public String greeting() {
        return greeting;
    }
}
