package com.example.demo.controllers;

import com.example.demo.services.Calc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerRes {
    private Calc calc;

    @Autowired
    public ControllerRes(@Qualifier ("calcResImpl") Calc calc){
        this.calc = calc;
    }

    @GetMapping("/res")
    public int resMethod(int numA, int numB){
        int res = calc.calcMethod(numA,numB);











































































































        return res;
    }







}
