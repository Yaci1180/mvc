package com.example.demo.controllers;

import com.example.demo.services.Calc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerSum {

    private Calc calc;

    @Autowired
    public ControllerSum(@Qualifier("calcSumImpl") Calc calc){
        this.calc = calc;

    }
    @GetMapping("/sum")
    public int calcMetodo(int numA, int numB){

        int sum = calc.calcMethod(numA,numB);
        return sum;
    }


}
