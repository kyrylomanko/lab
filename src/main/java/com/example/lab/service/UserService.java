package com.example.lab.service;

import com.example.lab.User.User;

import java.util.List;

public interface UserService {
    List<User> findAllUsers();
}