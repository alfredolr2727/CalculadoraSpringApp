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
        final Long result = this.operationService.addition(5L, 5L);

        assertNotNull(result);
        assertEquals(10L, result);
    }

    @Test
    public void additionWithCorrectResult2Test() {
        final Long result = this.operationService.addition(50L, 23L);

        assertNotNull(result);
        assertEquals(73L, result);
    }

    @Test
    public void additionWithCorrectNegativeResultTest() {
        final Long result = this.operationService.addition(5L, -10L);

        assertNotNull(result);
        assertEquals(-5L, result);
    }

    @Test
    public void additionWithNullNumberATest() {
        assertThrows(NullPointerException.class, () -> {
            this.operationService.addition(null, 10L);
        });
    }

    @Test
    public void additionWithNullNumberBTest() {
        assertThrows(NullPointerException.class, () -> {
            this.operationService.addition(10L, null);
        });
    }

    // SUBTRACTION UNIT TESTS
    @Test
    public void subtractionWithCorrectResultTest() {
        final Long result = this.operationService.subtraction(5L, 5L);

        assertNotNull(result);
        assertEquals(0L, result);
    }

    @Test
    public void subtractionWithCorrectResult2Test() {
        final Long result = this.operationService.subtraction(50L, 23L);

        assertNotNull(result);
        assertEquals(27L, result);
    }

    @Test
    public void subtractionWithCorrectNegativeResultTest() {
        final Long result = this.operationService.subtraction(5L, 10L);

        assertNotNull(result);
        assertEquals(-5, result);
    }

    @Test
    public void subtractionWithNullNumberATest() {
        assertThrows(NullPointerException.class, () -> {
            this.operationService.subtraction(null, 10L);
        });
    }

    @Test
    public void subtractionWithNullNumberBTest() {
        assertThrows(NullPointerException.class, () -> {
            this.operationService.subtraction(10L, null);
        });
    }

}