package com.ugur.microservices.handler;

import com.ugur.microservices.exception.DataNotFoundException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class DataNotFoundExceptionHandler {

    @ExceptionHandler(DataNotFoundException.class)
    public String dataNotFoundHandler() {
        return "dataNotFound";
    }
}
