package com.example.pg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class BasicAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(BasicAppApplication.class, args);
    }

}
