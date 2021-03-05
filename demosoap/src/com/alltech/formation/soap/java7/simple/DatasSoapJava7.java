package com.alltech.formation.soap.java7.simple;

import com.alltech.formation.soap.java7.simple.model.*;

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
	ResponseEmployee createEmployee(Employee employee);
	ResponseEmployee updateEmployee(Long employeeId, Employee employee);
	ResponseEmployees deleteEmployee(Long id);
	ResponseEmployee getEmployeeById(Long id);
	ResponseEquipes associer( Long employeeId, Long equipeId);
	ResponseEquipe getEquipeById(Long equipeId);
	ResponseStatistique getStatistiqueAllEmployees();
	ResponseStatistique getStatistiqueEquipe(Long id);
}
