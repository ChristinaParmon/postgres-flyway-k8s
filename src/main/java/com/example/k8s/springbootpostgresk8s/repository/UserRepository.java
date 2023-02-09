package com.example.k8s.springbootpostgresk8s.repository;

import com.example.k8s.springbootpostgresk8s.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
