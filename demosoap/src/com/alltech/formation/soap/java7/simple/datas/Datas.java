package com.alltech.formation.soap.java7.simple.datas;

import com.alltech.formation.soap.java7.simple.model.Employee;
import com.alltech.formation.soap.java7.simple.model.Equipe;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Datas {

    private static  List<Employee> employees=initEmployee();

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


    protected static Employee findEmployeeById(Long id){
        Employee employeeFound = null;
        for(Employee empl: employees){
            if(empl.getId()==id){
                employeeFound=empl;
                break;
            }
        }
        return employeeFound;
    }


    public static List<Employee> getEmployees() {
        return employees;
    }

    public static Employee getEmployeeById(Long id){
        Employee emp=null;
        emp=findEmployeeById(id);
        return findEmployeeById(id);
    }

    public static Employee createEmployee(Employee employee){
        Employee employeeToCreate=null;
        if(null==findEmployeeById(employee.getId())){
            employeeToCreate=employee;
            employees.add(employeeToCreate);
        }
        return employeeToCreate;
    }

    public static Employee updateEmployee(Long employeeId, Employee employee){
        int indexToModify = findIndexOfEmployee(employeeId);
        if(indexToModify>=0){
            employees.set(indexToModify,employee);
        }
        return employee;
    }

    private static int findIndexOfEmployee(Long employeeId) {
        int indexToModify=-1;
        for(int i=0;i<employees.size();i++){
            if(employees.get(i).getId()== employeeId){
                indexToModify =i;
                break;
            }
        }
        return indexToModify;
    }

    public static List<Employee> deleteEmployee(Long  employeeId){
        int indexToDelete = findIndexOfEmployee(employeeId);
        if(indexToDelete>=0) {
            employees.remove(indexToDelete);
        }
        return employees;
    }


}
