package com.example.demo.services;


import com.example.demo.model.Calculo;

public interface Calc {

    double divMethod(double numA, double numB);
    double multMethod(double numA, double numB);
    double resMethod(double numA, double numB);
    double sumMethod(double numA, double numB);
    double potMethod(double numA, double numB);
    Calculo getCalcMethod(Long calcId);
    void deleteCalcMethod(Long calcId);

}
