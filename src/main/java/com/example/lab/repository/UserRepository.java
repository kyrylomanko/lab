package com.example.lab.repository;

import com.example.lab.User.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // Empty for now
}
