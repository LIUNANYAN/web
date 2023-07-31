package com.example.projectbackend.entity;

import lombok.Data;

@Data
public class Account {
    int id;
    String email;
    String username;
    String password;

}
