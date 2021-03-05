package com.alltech.formation.soap.java7.simple;

import com.alltech.formation.soap.java7.simple.datas.Datas;
import com.alltech.formation.soap.java7.simple.model.ResponseEmployees;

import javax.jws.WebService;

@WebService(endpointInterface="com.alltech.formation.soap.java7.simple.DatasSoapJava7")
public class DatasSoapJava7WS implements DatasSoapJava7 {

	public ResponseEmployees getAllEmployees(){
		return  new ResponseEmployees(Datas.getEmployees());
	}
}
