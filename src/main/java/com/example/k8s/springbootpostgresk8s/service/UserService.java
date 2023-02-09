package com.example.k8s.springbootpostgresk8s.service;

import com.example.k8s.springbootpostgresk8s.dto.UserDto;
import com.example.k8s.springbootpostgresk8s.entity.User;
import com.example.k8s.springbootpostgresk8s.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;
@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User save(UserDto userDto) {
        User user = new User()
                .setName(userDto.getName())
                .setBirthDay(userDto.getBirthDay())
                .setId(UUID.randomUUID().toString())
                .setCreatedAt(LocalDateTime.now());

        return userRepository.save(user);
    }

    public Iterable<User> getAll() {
        return userRepository.findAll();
    }
}
