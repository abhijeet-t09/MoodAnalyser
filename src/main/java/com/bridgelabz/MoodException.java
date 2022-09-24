package com.bridgelabz;

public class MoodException extends Exception {

    public enum ExceptionType{
        NULL
    }

    public ExceptionType type;

    public MoodException(ExceptionType type, String message) {
        super(message);
        this.type = type;

    }
}
