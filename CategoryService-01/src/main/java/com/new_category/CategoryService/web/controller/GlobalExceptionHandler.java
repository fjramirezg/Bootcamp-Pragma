package com.new_category.CategoryService.web.controller;

import com.new_category.CategoryService.domain.exception.CategoriaException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(CategoriaException.class)
    public ResponseEntity<String> handleCategoriaException(CategoriaException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
    }
}