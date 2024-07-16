package com.example.pg.controller;


import com.example.pg.api.Registration;
import com.example.pg.serviceImpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class BasicController {

    @Autowired
    UserServiceImpl userService;

    @GetMapping("/ok")
    public ResponseEntity<String> checkOk() {
        return new ResponseEntity<>("Up and Running", HttpStatus.OK);
    }

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody Registration registration) {
        System.out.println(registration.toString());
        return new ResponseEntity<>(userService.registerUser(registration), HttpStatus.OK);
    }
}
