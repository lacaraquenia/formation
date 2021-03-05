package net.guides.springboot2.springboot2jpacrudexample.services;

import net.guides.springboot2.springboot2jpacrudexample.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    List<EmployeeDto> listerEmployees();

    EmployeeDto creerEmployee(EmployeeDto nouveauEmployee);

    EmployeeDto chercherEmployee(Long id);

    EmployeeDto modifierEmployee(Long id,EmployeeDto employeeDto);

    boolean supprimerEmployee(Long id);
}
