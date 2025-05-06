package com.example.hacka1.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
public class SolicitudIA {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TEXT")
    private String consulta;

    @Column(columnDefinition = "TEXT")
    private String respuesta;
    private Integer tokensConsumidos;
    private LocalDateTime fechaHora;
    @ManyToOne
    private Usuario usuario;
}