package org.example;

public class ExpenseNotFoundException extends RuntimeException{
    ExpenseNotFoundException(String message){
        super(message);
    }

}
