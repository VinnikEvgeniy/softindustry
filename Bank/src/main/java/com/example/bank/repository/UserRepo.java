package com.example.bank.repository;

import com.example.bank.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, String> {
    User findByName(String name);
}
