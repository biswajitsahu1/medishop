package com.medishop.Medicines.exceptions;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(){
        super("Resources not found in the database");
    }
    public ResourceNotFoundException(String message) {
        super(message);
    }
}
