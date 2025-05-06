package com.example.hacka1.dtos;

import java.time.LocalDateTime;

public class RequestHistoryDTO {
    private Long requestId;
    private String model;
    private String prompt;
    private String response;
    private int tokensUsed;
    private LocalDateTime timestamp;

    // Getters y setters
    public Long getRequestId() { return requestId; }
    public void setRequestId(Long requestId) { this.requestId = requestId; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public String getPrompt() { return prompt; }
    public void setPrompt(String prompt) { this.prompt = prompt; }

    public String getResponse() { return response; }
    public void setResponse(String response) { this.response = response; }

    public int getTokensUsed() { return tokensUsed; }
    public void setTokensUsed(int tokensUsed) { this.tokensUsed = tokensUsed; }

    public LocalDateTime getTimestamp() { return timestamp; }
    public void setTimestamp(LocalDateTime timestamp) { this.timestamp = timestamp; }
}