package com.example.hacka1.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/company/users")
public class UserManagementController {

    @Autowired
    private UserService userService;

    // 1. Crear nuevo usuario
    @PostMapping
    public ResponseEntity<UserResponseDTO> createUser(@RequestBody CreateUserDTO dto) {
        return ResponseEntity.ok(userService.createUser(dto));
    }

    // 2. Listar todos los usuarios
    @GetMapping
    public ResponseEntity<List<UserResponseDTO>> getAllUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }

    // 3. Obtener información detallada de un usuario
    @GetMapping("/{id}")
    public ResponseEntity<UserResponseDTO> getUserById(@PathVariable Long id) {
        return ResponseEntity.ok(userService.getUserById(id));
    }

    // 4. Actualizar información de usuario
    @PutMapping("/{id}")
    public ResponseEntity<UserResponseDTO> updateUser(@PathVariable Long id, @RequestBody UpdateUserDTO dto) {
        return ResponseEntity.ok(userService.updateUser(id, dto));
    }

    // 5. Asignar límite específico a un usuario
    @PostMapping("/{id}/limits")
    public ResponseEntity<UserLimitDTO> assignLimit(@PathVariable Long id, @RequestBody UserLimitDTO dto) {
        return ResponseEntity.ok(userService.assignLimit(id, dto));
    }

    // 6. Obtener reporte de consumo del usuario
    @GetMapping("/{id}/consumption")
    public ResponseEntity<UserConsumptionDTO> getConsumption(@PathVariable Long id) {
        return ResponseEntity.ok(userService.getConsumptionReport(id));
    }
}