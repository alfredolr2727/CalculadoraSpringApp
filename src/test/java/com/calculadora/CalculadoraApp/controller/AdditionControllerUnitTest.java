package com.calculadora.CalculadoraApp.controller;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class AdditionControllerUnitTest {

    @Autowired
    private MockMvc mockMvc;

    private static final String API_ROOT_PATH = "/api";

    @Test
    public void additionOperationWithSuccess200() throws Exception {
        mockMvc.perform(get(API_ROOT_PATH +"/addition")
                        .param("numberA",String.valueOf(1L))
                        .param("numberB", String.valueOf(1L)))
                .andExpect(status().is(HttpStatus.OK.value()))
                .andExpect(content().string("2"));
    }

    @Test
    public void additionOperationWithInvalidParamNumberA400() throws Exception {

        Long numberA = Long.valueOf(String.valueOf(Integer.MAX_VALUE)) + 1L;

        mockMvc.perform(get(API_ROOT_PATH +"/addition")
                        .param("numberA", String.valueOf(numberA))
                        .param("numberB", String.valueOf(1L)))
                .andExpect(status().isBadRequest())
                .andReturn().getResponse().getContentAsString();
    }

    @Test
    public void additionOperationWithInvalidParamNumberB400() throws Exception {

        Long numberB = Long.valueOf(String.valueOf(Integer.MIN_VALUE)) - 1L;

        mockMvc.perform(get(API_ROOT_PATH +"/addition")
                        .param("numberA", String.valueOf(1L))
                        .param("numberB", String.valueOf(numberB)))
                .andExpect(status().isBadRequest())
                .andReturn().getResponse().getContentAsString();
    }

    @Test
    public void subtractionOperationWithSuccess200() throws Exception {
        mockMvc.perform(get(API_ROOT_PATH +"/subtraction")
                        .param("numberA",String.valueOf(1L))
                        .param("numberB", String.valueOf(1L)))
                .andExpect(status().is(HttpStatus.OK.value()))
                .andExpect(content().string("0"));
    }

    @Test
    public void subtractionOperationWithInvalidParamNumberA400() throws Exception {

        Long numberA = Long.valueOf(String.valueOf(Integer.MAX_VALUE)) + 1L;

        mockMvc.perform(get(API_ROOT_PATH +"/subtraction")
                        .param("numberA", String.valueOf(numberA))
                        .param("numberB", String.valueOf(1L)))
                .andExpect(status().isBadRequest())
                .andReturn().getResponse().getContentAsString();
    }

    @Test
    public void subtractionOperationWithInvalidParamNumberB400() throws Exception {

        Long numberB = Long.valueOf(String.valueOf(Integer.MIN_VALUE)) - 1L;

        mockMvc.perform(get(API_ROOT_PATH +"/subtraction")
                        .param("numberA", String.valueOf(1L))
                        .param("numberB", String.valueOf(numberB)))
                .andExpect(status().isBadRequest())
                .andReturn().getResponse().getContentAsString();
    }

}