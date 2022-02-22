package com.calculadora.CalculadoraApp.service.impl;

import com.calculadora.CalculadoraApp.service.OperationService;
import lombok.NonNull;
import org.springframework.stereotype.Service;

@Service
public class OperationServiceImpl implements OperationService {

    @Override
    public Integer addition(@NonNull Integer numberA,
                            @NonNull Integer numberB) {
        return numberA + numberB;
    }

    @Override
    public Integer subtraction(@NonNull Integer numberA,
                               @NonNull Integer numberB) {
        return numberA - numberB;
    }
}
