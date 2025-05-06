package com.example.hacka1.controller;

import com.example.hacka1.domain.RestriccionModelo;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/company/restrictions")
@RequiredArgsConstructor
public class RestriccionModeloController {
    private final RestriccionModeloService restriccionService;
    @PostMapping
    public ResponseEntity<RestriccionModelo> crearRestriccion(@RequestBody RestriccionModelo restriccion) {
        RestriccionModelo nueva = restriccionService.crearRestriccion(restriccion);
        return ResponseEntity.ok(nueva);
    }

    @GetMapping
    public ResponseEntity<List<RestriccionModelo>> listarRestricciones() {
        return ResponseEntity.ok(restriccionService.listarRestricciones());
    }

    @PutMapping("/{id}")
    public ResponseEntity<RestriccionModelo> actualizarRestriccion(@PathVariable Long id, @RequestBody RestriccionModelo restriccion) {
        return ResponseEntity.ok(restriccionService.actualizarRestriccion(id, restriccion));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarRestriccion(@PathVariable Long id) {
        restriccionService.eliminarRestriccion(id);
        return ResponseEntity.noContent().build();
    }
}