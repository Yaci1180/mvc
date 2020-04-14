package com.example.demo.repositories;
import com.example.demo.model.Calculos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalculosRepository extends JpaRepository<Calculos, Long> {
}
