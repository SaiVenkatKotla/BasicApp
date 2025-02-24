package com.example.pg.api;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
public class Registration {

    private String name;

    private String phoneNumber;

    private String email;

    private String password;

}
