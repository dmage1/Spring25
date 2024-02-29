package com.example.restservice.customer;

public class InvalidCustomerId extends Exception {
    public InvalidCustomerId(String errorMessage) {
        super(errorMessage);
    }

}
