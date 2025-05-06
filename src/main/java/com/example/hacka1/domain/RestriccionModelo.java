package com.example.hacka1.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class RestriccionModelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tipoModelo;
    private Integer limiteTokens;
    private Integer limitePorDia;
    private Integer ventanaTiempoHoras;

    @ManyToOne
    private Empresa empresa;
}