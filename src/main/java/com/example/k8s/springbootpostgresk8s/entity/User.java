package com.example.k8s.springbootpostgresk8s.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity(name = "users")
@Data
@Accessors(chain = true)
public class User {
    @Id
    private String id;

    private String name;

    private LocalDate birthDay;

    private LocalDateTime createdAt;
}
