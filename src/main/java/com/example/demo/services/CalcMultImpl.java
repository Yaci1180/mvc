package com.example.demo.services;


import org.springframework.stereotype.Service;

@Service
public class CalcMultImpl implements Calc {
    @Override
    public int calcMethod(int numA, int numB) {

        int mult = numA * numB;
        return mult;
    }
}
