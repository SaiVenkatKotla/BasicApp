package com.example.pg.serviceImpl;

import com.example.pg.api.Registration;
import com.example.pg.repository.UserRepository;
import com.example.pg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;


    @Override
    public String registerUser(Registration registration) {
        try {
            userRepository.save(registration);
            return "Registered Successfully";
        }catch (Exception e){
            e.printStackTrace();
            return "Registration Failed";
        }
    }
}
