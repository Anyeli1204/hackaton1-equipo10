package com.example.hacka1.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class LimiteUsuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String modelo;
    private Integer tokensMaximos;
    private Integer solicitudesMaximas;
    private Integer ventanaTiempoHoras;

    @ManyToOne
    private Usuario usuario;
}
