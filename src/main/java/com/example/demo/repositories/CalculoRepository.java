package com.example.demo.repositories;
import com.example.demo.model.CalcType;
import com.example.demo.model.Calculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CalculoRepository extends JpaRepository<Calculo, Long> {
    List<Calculo> findAllByCalcType(CalcType calcType);
}

