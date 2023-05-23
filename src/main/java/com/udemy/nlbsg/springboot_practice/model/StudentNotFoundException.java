package com.udemy.nlbsg.springboot_practice.model;

public class StudentNotFoundException extends RuntimeException {
    
    public StudentNotFoundException() {

    }

    public StudentNotFoundException(String message) {
        super(message);
    }
}
