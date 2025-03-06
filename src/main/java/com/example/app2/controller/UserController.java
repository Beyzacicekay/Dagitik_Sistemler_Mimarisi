package com.example.app2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.app2.model.User;
import com.example.app2.repository.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {

    // Sabit bir metin kullanıyoruz
    private final String instanceName = "Beyza Nur Çiçekay Dağıtık Sistemler Ödev "; 

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/instance")
    public String getInstanceName() {
        return "Ödev  Adı: " + instanceName;
    }
}