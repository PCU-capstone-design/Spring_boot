package com.example.demo.dto;

import com.example.demo.entity.Infomation;

public class Firstdto {
    private String email;
    private String password;

    public Firstdto(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Firstdto{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Infomation toEntity() {

        return new Infomation(null,email,password);
    }
}
