package com.calculadora.CalculadoraApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class AdditionController {
    @GetMapping("/addition")
    public String getAdditionResult() {
        return "resultAddition";
    }
}
