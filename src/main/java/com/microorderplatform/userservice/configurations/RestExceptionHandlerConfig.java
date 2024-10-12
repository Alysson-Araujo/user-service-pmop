package com.microorderplatform.inventoryservice.configurations;




import com.microorderplatform.userservice.exceptions.BodyException;
import com.microorderplatform.userservice.exceptions.dataexception.DataIntegrityViolationException;
import com.microorderplatform.userservice.utils.ErrorResponseUtil;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.NoSuchElementException;

@RestControllerAdvice
public class RestExceptionHandlerConfig {

    @ExceptionHandler(DataIntegrityViolationException.class)
    private ResponseEntity<BodyException> handleDataIntegrityViolationException(DataIntegrityViolationException exception) {
        BodyException response = ErrorResponseUtil.buildErrorResponse(
                exception.getMessage(),
                "Data Integrity Violation",
                HttpStatus.BAD_REQUEST
        );
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    private ResponseEntity<BodyException> handleHttpMessageNotReadableException(HttpMessageNotReadableException exception) {
        BodyException response = ErrorResponseUtil.buildErrorResponse(
                exception.getMessage(),
                "Malformed JSON request",
                HttpStatus.BAD_REQUEST
        );
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(IllegalArgumentException.class)
    private ResponseEntity<BodyException> handleIllegalArgumentException(IllegalArgumentException exception) {
        BodyException response = ErrorResponseUtil.buildErrorResponse(
                exception.getMessage(),
                "Invalid Argument",
                HttpStatus.BAD_REQUEST
        );
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    private ResponseEntity<BodyException> handleMethodArgumentNotValidException(MethodArgumentNotValidException exception) {
        BodyException response = ErrorResponseUtil.buildErrorResponse(
                exception.getMessage(),
                "Method Argument Not Valid",
                HttpStatus.BAD_REQUEST
        );
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(NoSuchElementException.class)
    private ResponseEntity<BodyException> handleNoSuchElementException(NoSuchElementException exception) {
        BodyException response = ErrorResponseUtil.buildErrorResponse(
                exception.getMessage(),
                "No Such Element",
                HttpStatus.NOT_FOUND
        );
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(NullPointerException.class)
    private ResponseEntity<BodyException> handleNullPointerException(NullPointerException exception) {
        BodyException response = ErrorResponseUtil.buildErrorResponse(
                exception.getMessage(),
                "Null Pointer Exception",
                HttpStatus.BAD_REQUEST
        );
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }

}
