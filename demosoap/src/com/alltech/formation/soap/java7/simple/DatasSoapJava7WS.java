package com.alltech.formation.soap.java7.simple;

import com.alltech.formation.soap.java7.simple.datas.Datas;
import com.alltech.formation.soap.java7.simple.model.Employee;
import com.alltech.formation.soap.java7.simple.model.ResponseEmployee;
import com.alltech.formation.soap.java7.simple.model.ResponseEmployees;
import com.alltech.formation.soap.java7.simple.model.ResponseEquipes;

import javax.jws.WebService;
import javax.xml.ws.Response;

@WebService(endpointInterface="com.alltech.formation.soap.java7.simple.DatasSoapJava7")
public class DatasSoapJava7WS implements DatasSoapJava7 {

	@Override
	public ResponseEmployees getAllEmployees(){
		return  new ResponseEmployees(Datas.getEmployees());
	}

	@Override
	public ResponseEquipes getAllEquipes(){
		return  new ResponseEquipes(Datas.getEquipes());
	}

	@Override
    public Employee createEmployee(Employee employee) {
        //return new Employee(Datas.createEmployee(employee));
		return Datas.createEmployee(employee);
    }

	@Override
    public ResponseEmployee updateEmployee(Long employeeId, Employee employee){
		Employee emp=Datas.updateEmployee(employeeId,employee);
		return new ResponseEmployee(emp);
	}

	@Override
	public ResponseEmployees deleteEmployee(Long id){
		return new ResponseEmployees(Datas.deleteEmployee(id));
	}

	@Override
	public Employee getEmployeeById(Long id){
		return Datas.getEmployeeById(id);
	}

}
