package com.example.testsp3java;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public String greet() {
        return "hello, World!";
    }
}
