package com.example.kafkademo;

import lombok.Data;

@Data
public class Greeting {
    private String msg;
    private String name;

    public Greeting(String msg, String name) {
        this.msg = msg;
        this.name = name;
    }
}
