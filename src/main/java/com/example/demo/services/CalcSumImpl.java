package com.example.demo.services;

import org.springframework.stereotype.Service;

@Service
public class CalcSumImpl implements Calc {
    @Override
    public int calcMethod(int numA, int numB) {

        int sum = numA + numB;
        return sum;
    }
}
