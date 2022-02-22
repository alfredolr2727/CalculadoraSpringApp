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
@RequestMapping
public class AdditionController {

    private OperationService operationService;

    @Autowired
    public AdditionController(final OperationServiceImpl operationServiceImpl) {
        this.operationService = operationServiceImpl;
    }

    @GetMapping("/addition")
    public ResponseEntity<Integer> getAdditionResult(@RequestParam Integer numberA, @RequestParam Integer numberB) {
        final Integer result = this.operationService.addition(numberA, numberB);

        return ResponseEntity.ok(result);
    }
}
