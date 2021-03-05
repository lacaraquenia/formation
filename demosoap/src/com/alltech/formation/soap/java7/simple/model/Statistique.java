package com.alltech.formation.soap.java7.simple.model;

import java.util.List;

public class Statistique {

    private int idStatistique;
    /**null s'il s'agit de la liste de tous les employés*/
    private Equipe equipe;
    private double chiffreAffairesTotal;
    private double beneficeTotal;
    private Employee employeeChiffreAffairesMax;
    private Employee employeeChiffreAffairesMin;
    private Employee employeePlusRentable;
    private List<Employee> employeesPeuRentables;



    public int getIdStatistique() {
        return idStatistique;
    }

    public void setIdStatistique(int idStatistique) {
        this.idStatistique = idStatistique;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

    public double getChiffreAffairesTotal() {
        return chiffreAffairesTotal;
    }

    public void setChiffreAffairesTotal(double chiffreAffairesTotal) {
        this.chiffreAffairesTotal = chiffreAffairesTotal;
    }

    public double getBeneficeTotal() {
        return beneficeTotal;
    }

    public void setBeneficeTotal(double beneficeTotal) {
        this.beneficeTotal = beneficeTotal;
    }

    public Employee getEmployeeChiffreAffairesMax() {
        return employeeChiffreAffairesMax;
    }

    public void setEmployeeChiffreAffairesMax(Employee employeeChiffreAffairesMax) {
        this.employeeChiffreAffairesMax = employeeChiffreAffairesMax;
    }

    public Employee getEmployeeChiffreAffairesMin() {
        return employeeChiffreAffairesMin;
    }

    public void setEmployeeChiffreAffairesMin(Employee employeeChiffreAffairesMin) {
        this.employeeChiffreAffairesMin = employeeChiffreAffairesMin;
    }

    public Employee getEmployeePlusRentable() {
        return employeePlusRentable;
    }

    public void setEmployeePlusRentable(Employee employeePlusRentable) {
        this.employeePlusRentable = employeePlusRentable;
    }

    public List<Employee> getEmployeesPeuRentables() {
        return employeesPeuRentables;
    }

    public void setEmployeesPeuRentables(List<Employee> employeesPeuRentables) {
        this.employeesPeuRentables = employeesPeuRentables;
    }
}
