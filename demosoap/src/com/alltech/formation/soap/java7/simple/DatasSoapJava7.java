package com.alltech.formation.soap.java7.simple;

import com.alltech.formation.soap.java7.simple.model.Employee;
import com.alltech.formation.soap.java7.simple.model.ResponseEmployee;
import com.alltech.formation.soap.java7.simple.model.ResponseEmployees;
import com.alltech.formation.soap.java7.simple.model.ResponseEquipes;

import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.util.List;

@WebService
@SOAPBinding(style=SOAPBinding.Style.RPC)
public interface DatasSoapJava7 {
	@WebResult(partName = "reponse")
	ResponseEmployees getAllEmployees();
	ResponseEquipes getAllEquipes();
	Employee createEmployee(Employee employee);
	ResponseEmployee updateEmployee(Long employeeId, Employee employee);
	ResponseEmployees deleteEmployee(Long id);
	Employee getEmployeeById(Long id);
}
