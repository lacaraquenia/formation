package com.alltech.formation.soap.java7.simple.model;

public class ResponseEmployee {

    private Employee employee;

    public ResponseEmployee(Employee employee){
        this.employee=employee;
    }


    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
