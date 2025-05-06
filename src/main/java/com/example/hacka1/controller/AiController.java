package com.example.hacka1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/api/ai")
public class AiController {
    @Autowired
    private AiService aiService;

    // 1. Consulta a modelo de chat
    @PostMapping("/chat")
    public ResponseEntity<AiResponseDTO> chat(@RequestBody ChatRequestDTO request) {
        return ResponseEntity.ok(aiService.chat(request));
    }

    // 2. Solicitud de completado de texto
    @PostMapping("/completion")
    public ResponseEntity<AiResponseDTO> completion(@RequestBody CompletionRequestDTO request) {
        return ResponseEntity.ok(aiService.completion(request));
    }

    // 3. Consulta a modelo multimodal (con imagen)
    @PostMapping("/multimodal")
    public ResponseEntity<AiResponseDTO> multimodal(
            @RequestParam("image") MultipartFile image,
            @RequestParam("prompt") String prompt) {
        return ResponseEntity.ok(aiService.multimodal(prompt, image));
    }

    // 4. Lista de modelos disponibles
    @GetMapping("/models")
    public ResponseEntity<List<ModelInfoDTO>> getModels() {
        return ResponseEntity.ok(aiService.getAvailableModels());
    }

    // 5. Historial de solicitudes del usuario
    @GetMapping("/history")
    public ResponseEntity<List<RequestHistoryDTO>> getHistory() {
        return ResponseEntity.ok(aiService.getUserRequestHistory());
    }
}