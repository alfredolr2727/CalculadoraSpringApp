package com.calculadora.CalculadoraApp.controller;

import com.calculadora.CalculadoraApp.service.OperationService;
import com.calculadora.CalculadoraApp.service.impl.OperationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/api")
public class SubtractionController {

    private OperationService operationService;

    @Autowired
    public SubtractionController(final OperationServiceImpl operationServiceImpl) {
        this.operationService = operationServiceImpl;
    }

    @GetMapping("/subtraction")
    public ResponseEntity<Long> getSubtractionResult(@RequestParam Long numberA, @RequestParam Long numberB) {
        final Long result = this.operationService.subtraction(numberA, numberB);

        return ResponseEntity.ok(result);
    }
}
