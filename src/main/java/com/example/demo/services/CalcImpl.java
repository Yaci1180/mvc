package com.example.demo.services;
import com.example.demo.model.CalcType;
import com.example.demo.model.Calculo;
import com.example.demo.repositories.CalculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalcImpl implements Calc{

    private  final CalculoRepository calculoRepository;

    @Autowired
    public CalcImpl(CalculoRepository calculoRepository){
        this.calculoRepository = calculoRepository;

    }
    @Override
    public int divMethod(int numA, int numB) {
        int div = numA/numB;

        Calculo calculo = Calculo.builder()
                .calcType(CalcType.div)
                .numA(numA)
                .numB(numB)
                .result(div)
                .build();

        calculoRepository.save(calculo);

        return div;
    }

    @Override
    public int multMethod(int numA, int numB) {
        int mult = numA * numB;

        Calculo calculo = Calculo.builder()
                .calcType(CalcType.mult)
                .numA(numA)
                .numB(numB)
                .result(mult)
                .build();

        calculoRepository.save(calculo);

        return mult;
    }

    @Override
    public int resMethod(int numA, int numB) {
        int res = numA - numB;

        Calculo calculo = Calculo.builder()
                .calcType(CalcType.res)
                .numA(numA)
                .numB(numB)
                .result(res)
                .build();

        calculoRepository.save(calculo);

        return res;
    }

    @Override
    public int sumMethod(int numA, int numB) {
        int sum = numA + numB;

        Calculo calculo = Calculo.builder()
                .calcType(CalcType.sum)
                .numA(numA)
                .numB(numB)
                .result(sum)
                .build();

        calculoRepository.save(calculo);

        return sum;
    }
}
