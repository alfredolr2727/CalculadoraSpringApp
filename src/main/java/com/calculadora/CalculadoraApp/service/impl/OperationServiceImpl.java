package com.calculadora.CalculadoraApp.service.impl;

import com.calculadora.CalculadoraApp.service.OperationService;
import lombok.NonNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class OperationServiceImpl implements OperationService {

    private static final Logger LOGGER = LoggerFactory.getLogger(OperationServiceImpl.class);

    @Override
    public Long addition(@NonNull Long numberA,
                         @NonNull Long numberB) {
        return numberA + numberB;
    }

    @Override
    public Long subtraction(@NonNull Long numberA,
                            @NonNull Long numberB) {
        return numberA - numberB;
    }
}
