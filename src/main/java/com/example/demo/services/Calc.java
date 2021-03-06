package com.example.demo.services;


import com.example.demo.model.CalcType;
import com.example.demo.model.Calculo;

import java.util.List;

public interface Calc {

    double divMethod(double numA, double numB);
    double multMethod(double numA, double numB);
    double resMethod(double numA, double numB);
    double sumMethod(double numA, double numB);
    double potMethod(double numA, double numB);
    Calculo getCalcMethod(Long calcId);
    void deleteCalcMethod(Long calcId);
    void deleteAllCalcMethod(CalcType calcType);
}
