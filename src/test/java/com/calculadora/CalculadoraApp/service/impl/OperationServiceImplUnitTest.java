package com.calculadora.CalculadoraApp.service.impl;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class OperationServiceImplUnitTest {

    @InjectMocks
    private OperationServiceImpl operationService;


    // ADDITION UNIT TESTS
    @Test
    public void additionWithCorrectResultTest() {
        final Integer result = this.operationService.addition(5, 5);

        assertNotNull(result);
        assertEquals(10, result);
    }

    @Test
    public void additionWithCorrectResult2Test() {
        final Integer result = this.operationService.addition(50, 23);

        assertNotNull(result);
        assertEquals(73, result);
    }

    @Test
    public void additionWithCorrectNegativeResultTest() {
        final Integer result = this.operationService.addition(5, -10);

        assertNotNull(result);
        assertEquals(-5, result);
    }

    @Test
    public void additionWithNullNumberATest() {
        assertThrows(NullPointerException.class, () -> {
            this.operationService.addition(null, 10);
        });
    }

    @Test
    public void additionWithNullNumberBTest() {
        assertThrows(NullPointerException.class, () -> {
            this.operationService.addition(10, null);
        });
    }

    // SUBTRACTION UNIT TESTS
    @Test
    public void subtractionWithCorrectResultTest() {
        final Integer result = this.operationService.subtraction(5, 5);

        assertNotNull(result);
        assertEquals(0, result);
    }

    @Test
    public void subtractionWithCorrectResult2Test() {
        final Integer result = this.operationService.subtraction(50, 23);

        assertNotNull(result);
        assertEquals(27, result);
    }

    @Test
    public void subtractionWithCorrectNegativeResultTest() {
        final Integer result = this.operationService.subtraction(5, 10);

        assertNotNull(result);
        assertEquals(-5, result);
    }

    @Test
    public void subtractionWithNullNumberATest() {
        assertThrows(NullPointerException.class, () -> {
            this.operationService.subtraction(null, 10);
        });
    }

    @Test
    public void subtractionWithNullNumberBTest() {
        assertThrows(NullPointerException.class, () -> {
            this.operationService.subtraction(10, null);
        });
    }

}