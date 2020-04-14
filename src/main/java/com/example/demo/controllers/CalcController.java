package com.example.demo.controllers;
import com.example.demo.model.CalcType;
import com.example.demo.model.Calculo;
import com.example.demo.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {

    private Calc calc;

    @Autowired
    public CalcController(Calc calc){
        this.calc = calc;

    }
    @PostMapping("/calc")
    public double calcMeth(double numA, double numB, CalcType calcType){

        switch (calcType) {
            case div:
                return calc.divMethod(numA, numB);
            case mult:
                return calc.multMethod(numA, numB);
            case res:
                return calc.resMethod(numA, numB);
            case sum:
                return calc.sumMethod(numA, numB);
            case pot:
                return calc.potMethod(numA, numB);
            default:
                throw new RuntimeException("messi");
        }
    }
    @GetMapping("/getCalc")
    public Calculo getCalc(Long calcId){
        return calc.getCalcMethod(calcId);
    }

    @GetMapping("/deletCalc")
    public void deleteCalc(Long calcId){
        calc.deleteCalcMethod(calcId);
    }

    @GetMapping("/deleteAllCalc")
    public void deleteAllCalc(CalcType calcType){
        calc.deleteAllCalcMethod(calcType);
    }

}