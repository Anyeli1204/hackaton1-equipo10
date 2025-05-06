package com.example.hacka1.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String ruc;

    private LocalDate fechaAfiliacion;
    private boolean activa;

    @OneToOne
    private Usuario administrador;

    @OneToMany(mappedBy = "empresa", cascade = CascadeType.ALL)
    private List<Usuario> usuarios = new ArrayList<>();

    @OneToMany(mappedBy = "empresa", cascade = CascadeType.ALL)
    private List<RestriccionModelo> restricciones = new ArrayList<>();

    @ManyToOne
    private Sparky sparky;
}