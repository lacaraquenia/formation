package com.alltech.formation.soap.java7.simple.model;

import java.util.List;

public class Equipe {
    private Long id;
    private String nom;
    private List<Employee> employees;

    public Long getId(){return id;}

    public void setId(Long id){
        this.id=id;
    }

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
