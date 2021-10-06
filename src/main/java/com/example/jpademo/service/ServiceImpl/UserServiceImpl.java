package com.example.jpademo.service.ServiceImpl;

import com.example.jpademo.entity.Address;
import com.example.jpademo.entity.User;
import com.example.jpademo.repo.AddressRepository;
import com.example.jpademo.repo.UserRepository;
import com.example.jpademo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    AddressRepository addressRepository;


    public void createUser(User model) {
        List<Address> list=new ArrayList<>();
        for(Address a:model.getAddresses()){
            list.add(a);
        }
        model.setAddresses(list);
        userRepository.save(model);


    }


    @Override
    public List<User> getAll() {
        return userRepository.findAll();

    }

    @Override
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    public void delete(long id) {
        userRepository.deleteById(id);
    }
}
