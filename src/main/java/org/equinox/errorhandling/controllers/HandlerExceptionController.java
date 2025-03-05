package org.equinox.errorhandling.controllers;

import org.equinox.errorhandling.exceptions.UserNotFoundException;
import org.equinox.errorhandling.models.Error;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

import java.util.Date;

@RestControllerAdvice
public class HandlerExceptionController {
    @ExceptionHandler(ArithmeticException.class)
    public ResponseEntity<Error> divisionByZero(Exception e) {
        Error error = new Error();
        error.setError("Error division by zero");
        error.setDate(new Date());
        error.setErrorCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
        error.setMessage(e.getMessage());
        return ResponseEntity.internalServerError().body(error);
    }

    @ExceptionHandler(NoHandlerFoundException.class)
    public ResponseEntity<Error> notFound(NoHandlerFoundException e) {
        Error error = new Error();
        error.setError("Error not found");
        error.setDate(new Date());
        error.setErrorCode(HttpStatus.NOT_FOUND.value());
        error.setMessage(e.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND.value()).body(error);
    }

    @ExceptionHandler(NumberFormatException.class)
    public ResponseEntity<Error> notFound(NumberFormatException e) {
        Error error = new Error();
        error.setError("Number format exception");
        error.setDate(new Date());
        error.setErrorCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
        error.setMessage(e.getMessage());
        return ResponseEntity.internalServerError().body(error);
    }

    @ExceptionHandler({NullPointerException.class, HttpMessageNotWritableException.class, UserNotFoundException.class})
    public ResponseEntity<Error> userRoleNotFoundException(Exception e) {
        Error error = new Error();
        error.setError("User or role not found");
        error.setDate(new Date());
        error.setErrorCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
        error.setMessage(e.getMessage());
        return ResponseEntity.internalServerError().body(error);
    }
}

