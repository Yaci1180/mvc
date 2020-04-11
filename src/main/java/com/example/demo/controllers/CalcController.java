package com.example.demo.controllers;
import com.example.demo.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {

    private CalcDivImpl calcDivImpl;
    private CalcMultImpl calcMultImpl;
    private CalcResImpl calcResImpl;
    private CalcSumImpl calcSumImpl;

    @Autowired
    public CalcController(CalcDivImpl calcDivImpl, CalcMultImpl calcMultImpl,CalcResImpl calcResImpl, CalcSumImpl calcSumImpl){
        this.calcDivImpl = calcDivImpl;
        this.calcMultImpl = calcMultImpl;
        this.calcResImpl = calcResImpl;
        this.calcSumImpl = calcSumImpl;

    }

    @GetMapping("/calc")
    public int calcMeth(int numA, int numB, String calcType){

        if(calcType.equals("div")) {
            return calcDivImpl.calcMethod(numA, numB);
        }else if(calcType.equals("mult")){
            return calcMultImpl.calcMethod(numA,numB);
        }else if (calcType.equals("res")){
            return calcResImpl.calcMethod(numA,numB);
        }else if (calcType.equals("sum")){
            return calcSumImpl.calcMethod(numA,numB);
        }else{
            throw new RuntimeException("CalcType incorrecto necesita ser un: div/mult/res/sum");
        }
    }
}