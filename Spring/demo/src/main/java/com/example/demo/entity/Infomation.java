package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Infomation {

    @Id
    @GeneratedValue
    private Long user_id;
    @Column
    private String id;
    @Column
    private String password;

    public Infomation(Long user_id, String id, String password) {
        this.user_id = user_id;
        this.id = id;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Infomation{" +
                "user_id='" + user_id + '\'' +
                ", id='" + id + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
