package com.example.demo.services;
import com.example.demo.model.CalcType;
import com.example.demo.model.Calculo;
import com.example.demo.repositories.CalculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static java.lang.StrictMath.pow;

@Service
public class CalcImpl implements Calc{

    private  final CalculoRepository calculoRepository;

    @Autowired
    public CalcImpl(CalculoRepository calculoRepository){
        this.calculoRepository = calculoRepository;

    }
    @Override
    public double divMethod(double numA, double numB) {
        double div = numA/numB;

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
    public double multMethod(double numA, double numB) {
        double mult = numA * numB;

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
    public double resMethod(double numA, double numB) {
        double res = numA - numB;

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
    public double sumMethod(double numA, double numB) {
        double sum = numA + numB;

        Calculo calculo = Calculo.builder()
                .calcType(CalcType.sum)
                .numA(numA)
                .numB(numB)
                .result(sum)
                .build();

        calculoRepository.save(calculo);

        return sum;
    }
    @Override
    public double potMethod(double numA, double numB) {
        double sum = pow(numA,numB);

        Calculo calculo = Calculo.builder()
                .calcType(CalcType.pot)
                .numA(numA)
                .numB(numB)
                .result(sum)
                .build();

        calculoRepository.save(calculo);

        return sum;
    }

    @Override
    public Calculo getCalcMethod(Long calcId) {
        Optional<Calculo> calculoO = calculoRepository.findById(calcId);
        if (calculoO.isPresent()) {
            return calculoO.get();

        }
        return null;
    }

}
