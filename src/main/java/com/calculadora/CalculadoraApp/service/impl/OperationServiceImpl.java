package com.calculadora.CalculadoraApp.service.impl;

import com.calculadora.CalculadoraApp.service.OperationService;
import org.springframework.stereotype.Service;

@Service
public class OperationServiceImpl implements OperationService {

    @Override
    public Integer addition(Integer numberA, Integer numberB) {
        return numberA + numberB;
    }

    @Override
    public Integer subtraction(Integer numberA, Integer numberB) {
        return numberA - numberB;
    }
}
