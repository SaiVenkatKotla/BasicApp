package com.example.pg.api;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "user")
public class User {

    @Id
    private String id;

    private String name;

    private String phoneNumber;

    private long amount;

    private String email;

    private String password;

    public synchronized void incrementAmount(long value) {
        this.amount += value;
    }

    public synchronized long getAmount() {
        return amount;
    }
}
