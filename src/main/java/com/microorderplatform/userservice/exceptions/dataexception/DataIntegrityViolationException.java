package com.microorderplatform.userservice.exceptions.dataexception;

public class DataIntegrityViolationException extends DataAccessException{
    public DataIntegrityViolationException(String msg) {
        super(msg);
    }

    public DataIntegrityViolationException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
