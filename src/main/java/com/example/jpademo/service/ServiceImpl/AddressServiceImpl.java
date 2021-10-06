package com.example.jpademo.service.ServiceImpl;

import com.example.jpademo.entity.Address;
import com.example.jpademo.entity.User;
import com.example.jpademo.repo.AddressRepository;
import com.example.jpademo.repo.UserRepository;
import com.example.jpademo.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    UserRepository addressRepository;
    @Override
    public void saveAddress(Address address) {




        


            addressRepository.save(address);
        }


    }
}
