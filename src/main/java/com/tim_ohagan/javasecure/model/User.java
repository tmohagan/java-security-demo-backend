package com.tim_ohagan.javasecure.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Document(collection = "users")

@Getter
@Setter
@EqualsAndHashCode
@ToString

public class User {

    @Id
    private String id;

    private String email;

    private String password;

    private String phoneNumber;

    private String address;

    private String creditCardNumber;

    public User() {
    }
}