package com.example.pg.scheduler;

import com.example.pg.serviceImpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class RandomScheduler {

    @Autowired
    UserServiceImpl userService;

    @Scheduled(fixedDelay = 10000, initialDelay = 5000)
    public void randomSchedule() {
        userService.amountIncrement();
    }
}
