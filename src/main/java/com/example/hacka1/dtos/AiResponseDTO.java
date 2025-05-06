package com.example.hacka1.dtos;

public class AiResponseDTO {
    private String response;
    private int tokensUsed;
    private String modelUsed;

    // Getters y setters
    public String getResponse() { return response; }
    public void setResponse(String response) { this.response = response; }

    public int getTokensUsed() { return tokensUsed; }
    public void setTokensUsed(int tokensUsed) { this.tokensUsed = tokensUsed; }

    public String getModelUsed() { return modelUsed; }
    public void setModelUsed(String modelUsed) { this.modelUsed = modelUsed; }
}