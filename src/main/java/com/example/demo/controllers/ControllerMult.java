package com.example.demo.controllers;

import com.example.demo.services.Calc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerMult {
    private Calc calc;

    @Autowired
    public ControllerMult(@Qualifier("calcMultImpl") Calc calc){

        this.calc = calc;
    }

    @GetMapping("/mult")
    public int multMethod(int numA, int numB) {

        int mult = calc.calcMethod(numA,numB);

        return mult;
    }
}
