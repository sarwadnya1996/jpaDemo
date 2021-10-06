package com.example.jpademo.controller;

import com.example.jpademo.entity.Address;
import com.example.jpademo.entity.User;
import com.example.jpademo.repo.AddressRepository;
import com.example.jpademo.service.AddressService;
import com.example.jpademo.service.ServiceImpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserServiceImpl userService;
    @Autowired
    AddressService addressService;


    @PostMapping("/createUser")
    @ResponseStatus(HttpStatus.CREATED)
    public void createUser(@RequestBody User user) {
        System.out.println(userService);
        userService.createUser(user);

    }

    @PostMapping("/createAddress")
    @ResponseStatus(HttpStatus.CREATED)
    public void createAddress(@RequestBody Address address) {
        addressService.saveAddress(address);

    }

    @GetMapping("/get/{name}")
    public List<User> getAll(@PathVariable String name) {
        return userService.getAll();
    }

    @PutMapping("/update")
    public User updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }

}



