package com.microorderplatform.userservice.exceptions.systemexceptions;

public class NullPointerException extends RuntimeException{
    public NullPointerException(String message) {
        super(message);
    }
    public NullPointerException(String message, Throwable cause) {
        super(message, cause);
    }
}
