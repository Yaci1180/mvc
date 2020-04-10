package com.example.demo.controllers;

import com.example.demo.services.Calc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerDiv {
    private Calc calc;

    @Autowired
    public ControllerDiv(@Qualifier("calcDivImpl") Calc calc){
        this.calc = calc;
    }

    @GetMapping("/div")
    public int multMethod(int numA, int numB) {

        int div = calc.calcMethod(numA,numB);
        return div;
    }
}


