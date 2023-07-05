package com.example.securityMaven.expection;

public class AccountDoesNotExistException extends RuntimeException{
    public AccountDoesNotExistException(String message){
        super(message);
    }
}
