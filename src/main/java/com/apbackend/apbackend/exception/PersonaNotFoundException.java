package com.apbackend.apbackend.exception;

public class PersonaNotFoundException extends RuntimeException {
    public PersonaNotFoundException(String message){
        super(message);
    }
}
