package com.example.pg.service;

import com.example.pg.api.Registration;
import org.springframework.stereotype.Service;


public interface UserService {
    public String registerUser(Registration registration);

}
