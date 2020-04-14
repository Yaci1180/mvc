package com.example.demo.model;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = 'calculos')
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Calculos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Enumerated(EnumType.STRING)
    private CalcType calcType;

    private int numA;
    private int numB;
    private int result;

}