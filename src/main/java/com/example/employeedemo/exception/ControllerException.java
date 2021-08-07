package com.example.employeedemo.exception;


import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@Getter
public class ControllerException extends RuntimeException {
    private final HttpStatus httpStatus;

    public ControllerException(HttpStatus status, String message) {
        super(message);
        this.httpStatus = status;
    }

    public String errorMessage() {
        return httpStatus.value() + ":".concat(getMessage());
    }
}
