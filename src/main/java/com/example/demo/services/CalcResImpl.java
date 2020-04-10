package com.example.demo.services;


import org.springframework.stereotype.Service;

@Service
public class CalcResImpl implements Calc {
    @Override
    public int calcMethod(int numA, int numB) {

        int res = numA - numB;
        return res;
    }
}
