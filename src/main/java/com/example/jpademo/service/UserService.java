package com.example.jpademo.service;

import com.example.jpademo.entity.User;

import java.util.List;

public interface UserService {
   void  createUser(User user);

   List<User> getAll();
   User updateUser(User user);
}
