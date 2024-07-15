package com.example.pg.repository;

import com.example.pg.api.Registration;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository< Registration, String> {
}
