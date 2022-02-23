package com.calculadora.CalculadoraApp.service.impl;

import com.calculadora.CalculadoraApp.service.OperationService;
import lombok.NonNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class OperationServiceImpl implements OperationService {

    // Simulamos con un log el JAR de "traceo" que no venia con el enunciado y no he podido usar
    private static final Logger LOGGER = LoggerFactory.getLogger(OperationServiceImpl.class);

    @Override
    public Long addition(@NonNull Long numberA, @NonNull Long numberB) {

        final Long result = numberA + numberB;

        LOGGER.info("El resultado de la suma entre {} y {} es: {}", numberA, numberB, result);

        return result;
    }

    @Override
    public Long subtraction(@NonNull Long numberA, @NonNull Long numberB) {

        final Long result = numberA - numberB;

        LOGGER.info("El resultado de la resta entre {} y {} es: {}", numberA, numberB, result);

        return result;
    }
}
