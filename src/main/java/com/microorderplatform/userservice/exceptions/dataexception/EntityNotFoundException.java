package com.microorderplatform.userservice.exceptions.dataexception;

public class EntityNotFoundException extends DataAccessException{
    public EntityNotFoundException(String msg) {
        super(msg);
    }

    public EntityNotFoundException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
