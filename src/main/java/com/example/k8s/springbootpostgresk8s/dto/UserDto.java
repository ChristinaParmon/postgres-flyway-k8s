package com.example.k8s.springbootpostgresk8s.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class UserDto {
    private String name;
    private LocalDate birthDay;
}
