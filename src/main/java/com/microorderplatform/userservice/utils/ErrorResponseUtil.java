package com.microorderplatform.userservice.utils;


import com.microorderplatform.userservice.exceptions.BodyException;
import org.springframework.http.HttpStatus;

import java.time.Instant;

public class ErrorResponseUtil {
    public static BodyException buildErrorResponse(String message, String error, HttpStatus status) {
        return new BodyException(
                message,
                error,
                status.toString(),
                Instant.now().toString()
        );
    }
}
