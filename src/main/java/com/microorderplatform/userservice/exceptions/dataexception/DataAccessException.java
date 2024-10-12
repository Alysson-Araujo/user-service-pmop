package com.microorderplatform.userservice.exceptions.dataexception;

import org.springframework.core.NestedRuntimeException;

public class DataAccessException extends NestedRuntimeException{
    public DataAccessException(String msg) {
        super(msg);
    }

    public DataAccessException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
