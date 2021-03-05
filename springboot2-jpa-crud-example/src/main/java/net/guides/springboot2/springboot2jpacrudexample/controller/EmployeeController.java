package net.guides.springboot2.springboot2jpacrudexample.controller;

import java.util.HashMap;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import net.guides.springboot2.springboot2jpacrudexample.datas.MockEquipe;
import net.guides.springboot2.springboot2jpacrudexample.generated.soapclient.DatasSoapJava7;
import net.guides.springboot2.springboot2jpacrudexample.generated.soapclient.DatasSoapJava7WSService;
import net.guides.springboot2.springboot2jpacrudexample.generated.soapclient.Employee;
import net.guides.springboot2.springboot2jpacrudexample.dto.EquipeDto;
import net.guides.springboot2.springboot2jpacrudexample.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

	@GetMapping("/employees")
	public List<EmployeeDto> getAllEmployees() {
		return employeeService.listerEmployees();
	}

	@GetMapping("/equipes")
	public List<EquipeDto> getAllEquipes() {
		return MockEquipe.getDatas();

	}

	@GetMapping("/employees/{id}")
	public ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable(value = "id") Long employeeId)
			throws ResourceNotFoundException {
		// todo

		return ResponseEntity.ok().body(new EmployeeDto());
	}

	@PostMapping("/employees")
	public EmployeeDto createEmployee(@Valid @RequestBody EmployeeDto employeeDto) {
		return employeeDto;
	}

	@PutMapping("/employees/{id}")
	public ResponseEntity<EmployeeDto> updateEmployee(@PathVariable(value = "id") Long employeeId,
													  @Valid @RequestBody EmployeeDto employeeDtoDetails) throws ResourceNotFoundException {
		// todo;
		EmployeeDto updatedEmployeeDto = employeeDtoDetails;
		return ResponseEntity.ok(updatedEmployeeDto);
	}

	@DeleteMapping("/employees/{id}")
	public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id") Long employeeId)
			throws ResourceNotFoundException {
		// todo
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}

	@PutMapping("/associe/{employeeId}/{equipeId}")
	public Map<String, Boolean> associeEmployeeEquipe(
			@PathVariable(value = "employeeId") Long employeeId,
			@PathVariable(value = "equipeId") Long equipeId) throws ResourceNotFoundException {
		// todo;
		Map<String, Boolean> response = new HashMap<>();
		response.put("associed", Boolean.TRUE);
		return response;
	}
}
