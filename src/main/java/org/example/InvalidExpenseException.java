package org.example;

public class InvalidExpenseException extends RuntimeException{
    public InvalidExpenseException(String message){
        super(message);
    }
}
