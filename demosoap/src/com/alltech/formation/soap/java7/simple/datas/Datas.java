package com.alltech.formation.soap.java7.simple.datas;

import com.alltech.formation.soap.java7.simple.model.Employee;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Datas {
    private static List<Employee> initEmployee() {
        List<Employee> datas = new ArrayList<>();
        datas.add(
                new Employee(1L, "Jean", "DURANT", "adqdaa@bbb.fr", BigDecimal.valueOf(10L), BigDecimal.valueOf(500))
        );
        datas.add(
                new Employee(2L, "Pierre", "DUPONT", "qddaaa@bbb.fr", BigDecimal.valueOf(100L), BigDecimal.valueOf(500))
        );
        datas.add(
                new Employee(3L, "Adam", "TROIJOUR", "qdd@bbb.fr", BigDecimal.valueOf(1000L), BigDecimal.valueOf(5000))
        );
        datas.add(
                new Employee(4L, "Alain", "TERIEUR", "dqd@bbb.fr", BigDecimal.valueOf(1000L), BigDecimal.valueOf(5))
        );
        datas.add(
                new Employee(6L, "Alex", "TERIEUR", "qdq@bbb.fr", BigDecimal.valueOf(1000L), BigDecimal.valueOf(50))
        );
        datas.add(
                new Employee(7L, "Elie", "COPTERE", "aaaaaa@bbb.fr", BigDecimal.valueOf(1020L), BigDecimal.valueOf(1000))
        );
        datas.add(
                new Employee(8L, "Gerard", "MENVUSSA", "jjjj@bbb.fr", BigDecimal.valueOf(2000L), BigDecimal.valueOf(3000))
        );
        datas.add(
                new Employee(9L, "Harry", "COVERRE", "iiiii@bbb.fr", BigDecimal.valueOf(100L), BigDecimal.valueOf(200))
        );
        return datas;
    }
    private static  List<Employee> employees=initEmployee();

    public static List<Employee> getEmployees() {
        return employees;
    }
}
