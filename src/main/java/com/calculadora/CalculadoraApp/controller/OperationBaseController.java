package com.calculadora.CalculadoraApp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.validation.ConstraintViolationException;

public class OperationBaseController {

    // Controla las validaciones de los parametros y devuelve un error 400 con un mensaje descriptivo.
    @ExceptionHandler(ConstraintViolationException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    private ResponseEntity<String> handleConstraintViolationException(ConstraintViolationException e) {
        return new ResponseEntity<>("Parametro incorrecto: " + e.getMessage(), HttpStatus.BAD_REQUEST);
    }
}
