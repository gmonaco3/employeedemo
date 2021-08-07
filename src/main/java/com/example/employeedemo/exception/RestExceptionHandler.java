package com.example.employeedemo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(ControllerException.class)
    @ResponseBody
    public ResponseEntity<JsonError> handleException(HttpServletRequest req, ControllerException e) {

        String errorURL = req.getRequestURL().toString();

        return new ResponseEntity<>(
                JsonError.builder()
                        .url(errorURL)
                        .message(e.getMessage())
                        .httpStatus(e.getHttpStatus())
                        .build(),
                e.getHttpStatus()
        );
    }

    @ExceptionHandler
    @ResponseBody
    public ResponseEntity<JsonError> handleUnexpectedException(HttpServletRequest req, Exception e) {

        String errorURL = req.getRequestURL().toString();

        return new ResponseEntity<>(
                JsonError.builder()
                        .url(errorURL)
                        .message("Unexpected Exception: ".concat(e.getMessage()))
                        .httpStatus(HttpStatus.INTERNAL_SERVER_ERROR)
                        .build(),
                HttpStatus.INTERNAL_SERVER_ERROR
        );
    }
}
