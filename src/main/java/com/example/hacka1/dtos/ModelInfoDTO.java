package com.example.hacka1.dtos;

public class ModelInfoDTO {
    private String modelName;
    private String description;
    private boolean available;

    // Getters y setters
    public String getModelName() { return modelName; }
    public void setModelName(String modelName) { this.modelName = modelName; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public boolean isAvailable() { return available; }
    public void setAvailable(boolean available) { this.available = available; }
}