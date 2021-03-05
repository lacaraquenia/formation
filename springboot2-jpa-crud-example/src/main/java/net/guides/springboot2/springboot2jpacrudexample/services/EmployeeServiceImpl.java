package net.guides.springboot2.springboot2jpacrudexample.services;

import net.guides.springboot2.springboot2jpacrudexample.dto.EmployeeDto;
import net.guides.springboot2.springboot2jpacrudexample.generated.soapclient.DatasSoapJava7;
import net.guides.springboot2.springboot2jpacrudexample.generated.soapclient.DatasSoapJava7WSService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public List<EmployeeDto> listerEmployees() {
        DatasSoapJava7WSService datasSoapJava7WSService	= new DatasSoapJava7WSService();
        DatasSoapJava7 datasSoapJava7  = datasSoapJava7WSService.getDatasSoapJava7WSPort();
        return datasSoapJava7.getAllEmployees().getEmployees()
                .stream().map(employee -> {
                    EmployeeDto employeeDto = new EmployeeDto();
                    employeeDto.setId(employee.getId());
                    employeeDto.setEmailId(employee.getEmailId());
                    employeeDto.setFirstName(employee.getFirstName());
                    employeeDto.setLastName(employee.getLastName());
                    employeeDto.setSalaire(employee.getSalaire());
                    employeeDto.setCa(employee.getCa());
                    return employeeDto;
                }).collect(Collectors.toList());

    }
}
