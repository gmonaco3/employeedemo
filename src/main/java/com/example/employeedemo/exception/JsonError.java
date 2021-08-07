package com.example.employeedemo.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
public class JsonError {
    private String url;
    private String message;
    private HttpStatus httpStatus;

}
