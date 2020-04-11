package com.example.demo.controllers;
import com.example.demo.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {

    private Calc calc;


    @Autowired
    public CalcController(Calc calc){
        this.calc = calc;

    }
    @GetMapping("/calc")
    public int calcMeth(int numA, int numB, String calcType){

        switch (calcType) {
            case "div":
                return calc.divMethod(numA, numB);
            case "mult":
                return calc.multMethod(numA, numB);
            case "res":
                return calc.resMethod(numA, numB);
            case "sum":
                return calc.sumMethod(numA, numB);
            default:
                throw new RuntimeException("CalcType incorrecto necesita ser un: div/mult/res/sum");
        }
    }
}