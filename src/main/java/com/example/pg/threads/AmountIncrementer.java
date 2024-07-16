package com.example.pg.threads;

import com.example.pg.api.User;

public class AmountIncrementer implements Runnable {

    private final User user;
    private final int incrementValue;

    public AmountIncrementer(User user, int incrementValue) {
        this.user = user;
        this.incrementValue = incrementValue;
    }

    @Override
    public void run() {
        user.incrementAmount(incrementValue);
        System.out.println("User " + user.getName() + " amount after increment: " + user.getAmount());
    }
}
