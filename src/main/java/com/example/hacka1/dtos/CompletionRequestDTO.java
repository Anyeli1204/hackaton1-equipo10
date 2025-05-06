package com.example.hacka1.dtos;

public class CompletionRequestDTO {
    private Long userId;
    private String text;

    // Getters y setters
    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }

    public String getText() { return text; }
    public void setText(String text) { this.text = text; }
}