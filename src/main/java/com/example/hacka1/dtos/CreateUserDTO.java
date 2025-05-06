package com.example.hacka1.dtos;

public class CreateUserDTO {
    private String name;
    private String email;
    private String role;  // Opcional: puede ser "user", "admin", etc.
    private Long companyId;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    public Long getCompanyId() { return companyId; }
    public void setCompanyId(Long companyId) { this.companyId = companyId; }
}