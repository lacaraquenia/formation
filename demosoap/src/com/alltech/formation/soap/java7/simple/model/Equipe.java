package com.alltech.formation.soap.java7.simple.model;

import java.util.List;

public class Equipe {
    private String nom;
    private List<Employee> employees;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
