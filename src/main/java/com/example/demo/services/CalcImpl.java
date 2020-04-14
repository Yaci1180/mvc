package com.example.demo.services;
import com.example.demo.model.CalcType;
import com.example.demo.model.Calculos;
import com.example.demo.repositories.CalculosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalcImpl implements Calc{

    private  final  CalculosRepository calculosRepository;

    @Autowired
    public CalcImpl(CalculosRepository calculosRepository){
        this.calculosRepository = calculosRepository;

    }

    @Override
    public int divMethod(int numA, int numB) {
        int div = numA/numB;

        Calculos calculos = Calculos.builder()
                .calcType(CalcType.div)
                .numA(numA)
                .numB(numB)
                .result(div)
                .build();

        return div;
    }

    @Override
    public int multMethod(int numA, int numB) {
        int mult = numA * numB;

        Calculos calculos = Calculos.builder()
                .calcType(CalcType.div)
                .numA(numA)
                .numB(numB)
                .result(mult)
                .build();

        return mult;
    }

    @Override
    public int resMethod(int numA, int numB) {
        int res = numA - numB;

        Calculos calculos = Calculos.builder()
                .calcType(CalcType.div)
                .numA(numA)
                .numB(numB)
                .result(res)
                .build();

        return res;
    }

    @Override
    public int sumMethod(int numA, int numB) {
        int sum = numA + numB;

        Calculos calculos = Calculos.builder()
                .calcType(CalcType.div)
                .numA(numA)
                .numB(numB)
                .result(sum)
                .build();

        return sum;
    }
}
