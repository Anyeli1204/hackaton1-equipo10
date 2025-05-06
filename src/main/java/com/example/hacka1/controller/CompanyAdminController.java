package com.example.hacka1.controller;

import com.example.hacka1.domain.Empresa;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin/companies")
@RequiredArgsConstructor
public class CompanyAdminController {

    private final EmpresaService empresaService;

    @PostMapping
    public ResponseEntity<Empresa> crearEmpresa(@RequestBody Empresa empresa) {
        Empresa nuevaEmpresa = empresaService.crearEmpresa(empresa);
        return ResponseEntity.ok(nuevaEmpresa);
    }

    @GetMapping
    public ResponseEntity<List<Empresa>> listarEmpresas() {
        return ResponseEntity.ok(empresaService.listarEmpresas());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Empresa> obtenerEmpresa(@PathVariable Long id) {
        return ResponseEntity.ok(empresaService.obtenerEmpresaPorId(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Empresa> actualizarEmpresa(@PathVariable Long id, @RequestBody Empresa empresaActualizada) {
        return ResponseEntity.ok(empresaService.actualizarEmpresa(id, empresaActualizada));
    }

    @PatchMapping("/{id}/status")
    public ResponseEntity<Void> cambiarEstado(@PathVariable Long id, @RequestParam boolean activa) {
        empresaService.cambiarEstadoEmpresa(id, activa);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}/consumption")
    public ResponseEntity<?> obtenerConsumoEmpresa(@PathVariable Long id) {
        return ResponseEntity.ok(empresaService.reporteConsumoEmpresa(id));
    }
}