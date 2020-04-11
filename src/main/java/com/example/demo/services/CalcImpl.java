package com.example.demo.services;


import org.springframework.stereotype.Service;

@Service
public class CalcImpl implements Calc{

    @Override
    public int divMethod(int numA, int numB) {
        int div = numA/numB;
        return div;
    }

    @Override
    public int multMethod(int numA, int numB) {
        int mult = numA * numB;
        return mult;
    }

    @Override
    public int resMethod(int numA, int numB) {
        int res = numA - numB;
        return res;
    }

    @Override
    public int sumMethod(int numA, int numB) {
        int sum = numA + numB;
        return sum;
    }
}
