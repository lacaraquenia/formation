package net.guides.springboot2.springboot2jpacrudexample.dto;

import java.util.List;

public class EquipeDto {
    private String nom;
    private List<EmployeeDto> employeeEntities;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<EmployeeDto> getEmployeeEntities() {
        return employeeEntities;
    }

    public void setEmployeeEntities(List<EmployeeDto> employeeEntities) {
        this.employeeEntities = employeeEntities;
    }
}
