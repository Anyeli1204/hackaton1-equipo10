package com.example.hacka1.domain;


import jakarta.persistence.*;
import lombok.Data;
import java.util.*;

@Data
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String correo;
    private String rol; // "ADMIN" o "USUARIO"

    @ManyToOne
    private Empresa empresa;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<LimiteUsuario> limites = new ArrayList<>();

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<SolicitudIA> historialSolicitudes = new ArrayList<>();
}