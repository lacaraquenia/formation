package net.guides.springboot2.springboot2jpacrudexample.controller;

import java.util.HashMap;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import net.guides.springboot2.springboot2jpacrudexample.dto.EquipeDto;
import net.guides.springboot2.springboot2jpacrudexample.generated.soapclient.Statistique;
import net.guides.springboot2.springboot2jpacrudexample.services.EmployeeService;
import net.guides.springboot2.springboot2jpacrudexample.services.EquipeService;
import net.guides.springboot2.springboot2jpacrudexample.services.StatistiqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.guides.springboot2.springboot2jpacrudexample.exception.ResourceNotFoundException;
import net.guides.springboot2.springboot2jpacrudexample.dto.EmployeeDto;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@Autowired
	EquipeService equipeService;


	StatistiqueService statistiqueService;


	/****************	URIs Employees	***********************/
	@GetMapping("/employees")
	public List<EmployeeDto> getAllEmployees() {
		return employeeService.listerEmployees();
	}


	@GetMapping("/employees/{id}")
	public EmployeeDto getEmployeeById(@PathVariable(value = "id") Long employeeId)
			throws ResourceNotFoundException {
		EmployeeDto employeeDto=null;
		employeeDto=employeeService.chercherEmployee(employeeId);
		return employeeDto;
	}

	@PostMapping("/employees")
	public EmployeeDto createEmployee(@Valid @RequestBody EmployeeDto employeeDto) {
		EmployeeDto employee=null;
		employee=employeeService.creerEmployee(employeeDto);
		return employeeDto;
	}

	@PutMapping("/employees/{id}")
	//public ResponseEntity<EmployeeDto> updateEmployee(@PathVariable(value = "id") Long employeeId,
	public EmployeeDto updateEmployee(@PathVariable(value = "id") Long employeeId,
													  @Valid @RequestBody EmployeeDto employeeDtoDetails) throws ResourceNotFoundException {
		return employeeService.modifierEmployee(employeeId,employeeDtoDetails);
	}

	@DeleteMapping("/employees/{id}")
	public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id") Long employeeId)
			throws ResourceNotFoundException {
		boolean isDeleted=employeeService.supprimerEmployee(employeeId);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", isDeleted);
		return response;
	}

	/****************	URIs Employees	***********************/
	@GetMapping("/equipes")
	public List<EquipeDto> getAllEquipes() {
		return equipeService.listerEquipes();
	}

	@PutMapping("/associe/{employeeId}/{equipeId}")
	public Map<String, Boolean> associeEmployeeEquipe(
			@PathVariable(value = "employeeId") Long employeeId,
			@PathVariable(value = "equipeId") Long equipeId) throws ResourceNotFoundException {
		boolean isAssociated=equipeService.associer(employeeId,equipeId);
		Map<String, Boolean> response = new HashMap<>();
		response.put("associed", isAssociated);
		return response;
	}

	/****************	URIs Additionnels	***********************/
	@GetMapping("/statistique")
	public Statistique statistiqueAllEmployees(){
		if(null==statistiqueService){
			//statistiqueService=new Statistique();
		}
		//return statistiqueService.getStatistiqueAllEmployees();
		//TODO
		return null;
	}


}
