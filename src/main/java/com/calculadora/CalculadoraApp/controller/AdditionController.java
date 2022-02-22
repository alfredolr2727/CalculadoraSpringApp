package com.calculadora.CalculadoraApp.controller;

import com.calculadora.CalculadoraApp.service.OperationService;
import com.calculadora.CalculadoraApp.service.impl.OperationServiceImpl;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Controller
@RequestMapping("/api")
@Validated
public class AdditionController {

    private OperationService operationService;

    @Autowired
    public AdditionController(final OperationServiceImpl operationServiceImpl) {
        this.operationService = operationServiceImpl;
    }

    @GetMapping("/addition")
    @ApiOperation(value = "Operacion de Suma", notes = "Endpoint que recibe 2 parametros y devuelve el resultado de la " +
            "suma de ambos. MAX: "+Integer.MAX_VALUE+" - MIN:"+Integer.MIN_VALUE)
    public ResponseEntity<Long> getAdditionResult(
            @RequestParam @Max(Integer.MAX_VALUE) @Min(Integer.MIN_VALUE) Long numberA,
            @RequestParam @Max(Integer.MAX_VALUE) @Min(Integer.MIN_VALUE) Long numberB) {

        final Long result = this.operationService.addition(numberA, numberB);

        return ResponseEntity.ok(result);
    }
}
