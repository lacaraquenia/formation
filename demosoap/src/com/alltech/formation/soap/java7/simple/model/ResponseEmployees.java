package com.alltech.formation.soap.java7.simple.model;

import java.util.List;

public class ResponseEmployees {
    private  List<Employee> employees;

    public ResponseEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
