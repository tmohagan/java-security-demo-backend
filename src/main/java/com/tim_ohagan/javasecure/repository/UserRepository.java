package com.tim_ohagan.javasecure.repository;

import com.tim_ohagan.javasecure.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
    User findByEmail(String email);
}