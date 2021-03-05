package com.alltech.formation.soap.java7.simple;

import com.alltech.formation.soap.java7.simple.datas.Datas;
import com.alltech.formation.soap.java7.simple.datas.DatasEquipe;
import com.alltech.formation.soap.java7.simple.model.*;

import javax.jws.WebService;
import javax.xml.ws.Response;

@WebService(endpointInterface="com.alltech.formation.soap.java7.simple.DatasSoapJava7")
public class DatasSoapJava7WS implements DatasSoapJava7 {

	/******************************************* Employee *********************************************/
	@Override
	public ResponseEmployees getAllEmployees(){
		return  new ResponseEmployees(Datas.getEmployees());
	}

	@Override
    public ResponseEmployee createEmployee(Employee employee) {
		return new ResponseEmployee(Datas.createEmployee(employee));
    }

	@Override
    public ResponseEmployee updateEmployee(Long employeeId, Employee employee){
		return new ResponseEmployee(Datas.updateEmployee(employeeId,employee));
	}

	@Override
	public ResponseEmployees deleteEmployee(Long id){
		return new ResponseEmployees(Datas.deleteEmployee(id));
	}

	@Override
	public ResponseEmployee getEmployeeById(Long id){
		return new ResponseEmployee(Datas.getEmployeeById(id));
	}

	/******************************************* Equipes *********************************************/

	@Override
	public ResponseEquipes getAllEquipes(){
		return  new ResponseEquipes(DatasEquipe.getEquipes());
	}

	@Override
	public ResponseEquipes associer(Long employeeId, Long equipeId) {
		return new ResponseEquipes(DatasEquipe.associer(employeeId,equipeId));
	}

	@Override
	public ResponseEquipe getEquipeById(Long equipeId) {
		return new ResponseEquipe(DatasEquipe.getEquipeById(equipeId));
	}

	/******************************************* Statistique *********************************************/
	@Override
	public ResponseStatistique getStatistiqueAllEmployees(){
		//TODO
		return null;
	}

	@Override
	public ResponseStatistique getStatistiqueEquipe(Long id){
		//TODO
		return null;
	}
}
