package com.alltech.formation.soap.java7.simple.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class Employee implements Serializable {

	private Long id;
	private String firstName;
	private String lastName;
	private String emailId;
	//ajouter les données chiffre d'affaire et salaire
	private BigDecimal ca;
	private BigDecimal salaire;
	public Employee() {
		
	}
	
	public Employee(long id, String firstName, String lastName, String emailId, BigDecimal ca, BigDecimal salaire ) {
		this.id=id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.ca = ca;
		this.salaire = salaire;
	}

	public BigDecimal getCa() {
		return ca;
	}

	public void setCa(BigDecimal ca) {
		this.ca = ca;
	}

	public BigDecimal getSalaire() {
		return salaire;
	}

	public void setSalaire(BigDecimal salaire) {
		this.salaire = salaire;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	

	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	

	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + emailId
				+ "]";
	}
	
}
