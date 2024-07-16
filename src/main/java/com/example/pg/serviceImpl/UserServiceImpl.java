package com.example.pg.serviceImpl;

import com.example.pg.api.Registration;
import com.example.pg.api.User;
import com.example.pg.repository.UserRepository;
import com.example.pg.service.UserService;
import com.example.pg.threads.AmountIncrementer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    private final ModelMapper modelMapper;

    public UserServiceImpl() {
        this.modelMapper = new ModelMapper();
    }

    @Override
    public String registerUser(Registration registration) {
        try {
            User user = modelMapper.map(registration, User.class);
            userRepository.save(user);
            return "Registered Successfully";
        } catch (Exception e) {
            e.printStackTrace();
            return "Registration Failed";
        }
    }

    public void amountIncrement() {
        try {
            List<User> users = userRepository.findAll();
            ArrayList<Thread> threads = new ArrayList<>();
            int increment = 5;

            for (User user : users) {
                threads.add(new Thread(new AmountIncrementer(user, increment)));
            }

            for (Thread thread : threads) {
                thread.start();
            }

            for (Thread thread : threads) {
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            userRepository.saveAll(users);
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
