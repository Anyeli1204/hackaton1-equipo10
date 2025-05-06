package com.example.hacka1.dtos;

public class ChatRequestDTO {
    private Long userId;
    private String prompt;

    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }

    public String getPrompt() { return prompt; }
    public void setPrompt(String prompt) { this.prompt = prompt; }
}