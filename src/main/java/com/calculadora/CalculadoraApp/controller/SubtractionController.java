package com.calculadora.CalculadoraApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SubtractionController {
    @GetMapping("/subtraction")
    public String getSubtractionResult() {
        return "resultSubtraction";
    }
}
