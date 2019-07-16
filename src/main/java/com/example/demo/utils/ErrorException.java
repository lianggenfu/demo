package com.example.demo.utils;

public class ErrorException extends RuntimeException{

    private String messagekey;

    private Object[] args;

    public ErrorException(String messagekey) {
        super(messagekey);
        this.messagekey = messagekey;
    }

    public ErrorException(String message, String messagekey) {
        super(message);
        this.messagekey = messagekey;
    }
}
