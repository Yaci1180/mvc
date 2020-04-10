package com.example.demo.services;


import org.springframework.stereotype.Service;

@Service
public class CalcDivImpl implements Calc{
    @Override
    public int calcMethod(int numA, int numB) {

        int div = numA/numB;
        return div;
    }
}
