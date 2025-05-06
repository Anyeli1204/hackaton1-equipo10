package com.example.hacka1.domain;

import jakarta.persistence.*;
import lombok.Data;
import java.util.*;

@Data
@Entity
public class Sparky {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "sparky", cascade = CascadeType.ALL)
    private List<Empresa> empresas = new ArrayList<>();
}