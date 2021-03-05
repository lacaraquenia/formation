package com.alltech.formation.soap.java7.simple;

import com.alltech.formation.soap.java7.simple.model.Employee;
import com.alltech.formation.soap.java7.simple.model.ResponseEmployees;

import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.util.List;

@WebService
@SOAPBinding(style=SOAPBinding.Style.RPC)
public interface DatasSoapJava7 {
	@WebResult(partName = "reponse")
	ResponseEmployees getAllEmployees();
}
