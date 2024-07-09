package com.example.pg.api;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
public class Registration {

    @Id
    private Long id;

    private String firstName;

    private String lastName;

    private String phoneNumber;

    private String email;

    private String password;

}
