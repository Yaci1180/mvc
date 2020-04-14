package com.example.demo.model;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "calculo")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Calculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Enumerated(EnumType.STRING)
    private CalcType calcType;

    private double numA;
    private double numB;
    private double result;

}