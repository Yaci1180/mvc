package com.example.demo.services;


import com.example.demo.model.Calculo;

public interface Calc {

    int divMethod(int numA, int numB);
    int multMethod(int numA, int numB);
    int resMethod(int numA, int numB);
    int sumMethod(int numA, int numB);
    Calculo getCalcMethod(Long calcId);

}
