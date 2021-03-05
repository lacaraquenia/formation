package com.alltech.formation.soap.java7.simple.datas;

import com.alltech.formation.soap.java7.simple.model.Employee;
import com.alltech.formation.soap.java7.simple.model.Equipe;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DatasEquipe {

    private static List<Equipe> equipes=initEquipes();

    public static List<Equipe> getEquipes(){
        return equipes;
    }

    private static Equipe initEquipe1(){
        Equipe equipe1=new Equipe();
        equipe1.setNom("Equipe 1");
        List<Employee> datas=new ArrayList<>();
        datas.add(new Employee(1L, "Jean", "DURANT", "adqdaa@bbb.fr", BigDecimal.valueOf(10L), BigDecimal.valueOf(500))
        );
        datas.add(
                new Employee(2L, "Pierre", "DUPONT", "qddaaa@bbb.fr", BigDecimal.valueOf(100L), BigDecimal.valueOf(500))
        );
        datas.add(
                new Employee(3L, "Adam", "TROIJOUR", "qdd@bbb.fr", BigDecimal.valueOf(1000L), BigDecimal.valueOf(5000))
        );
        equipe1.setEmployees(datas);
        return equipe1;
    }
    private static Equipe initEquipe2(){
        Equipe equipe2=new Equipe();
        equipe2.setNom("Equipe 2");
        List<Employee> datas=new ArrayList<>();
        datas.add(
                new Employee(4L, "Alain", "TERIEUR", "dqd@bbb.fr", BigDecimal.valueOf(1000L), BigDecimal.valueOf(5))
        );
        datas.add(
                new Employee(6L, "Alex", "TERIEUR", "qdq@bbb.fr", BigDecimal.valueOf(1000L), BigDecimal.valueOf(50))
        );
        equipe2.setEmployees(datas);
        return equipe2;
    }
    private static Equipe initEquipe3(){
        Equipe equipe3=new Equipe();
        equipe3.setNom("Equipe 3");
        List<Employee> datas=new ArrayList<>();
        datas.add(
                new Employee(7L, "Elie", "COPTERE", "aaaaaa@bbb.fr", BigDecimal.valueOf(1020L), BigDecimal.valueOf(1000))
        );
        datas.add(
                new Employee(8L, "Gerard", "MENVUSSA", "jjjj@bbb.fr", BigDecimal.valueOf(2000L), BigDecimal.valueOf(3000))
        );
        datas.add(
                new Employee(9L, "Harry", "COVERRE", "iiiii@bbb.fr", BigDecimal.valueOf(100L), BigDecimal.valueOf(200))
        );
        equipe3.setEmployees(datas);
        return equipe3;
    }

    private static List<Equipe> initEquipes(){
        List<Equipe> listEquipe=new ArrayList<>();
        listEquipe.add(initEquipe1());
        listEquipe.add(initEquipe2());
        listEquipe.add(initEquipe3());
        return listEquipe;
    }

    public static Equipe getEquipeById(Long idEquipe){
        for(Equipe equipe:equipes){
            if(equipe.getId()==idEquipe){
                return equipe;
            }
        }
        return null;
    }

    public static List<Equipe> associer(Long employeeId,Long equipeId){
        Employee employeeToAdd=Datas.findEmployeeById(employeeId);
        Equipe equipeToAdd=getEquipeById(equipeId);
        if(null!=employeeToAdd && null!=equipeToAdd){
            equipeToAdd.addEmployee(employeeToAdd);
        }
        return equipes;
    }
}
