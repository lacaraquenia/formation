package net.guides.springboot2.springboot2jpacrudexample.services;

import net.guides.springboot2.springboot2jpacrudexample.dto.EmployeeDto;
import net.guides.springboot2.springboot2jpacrudexample.dto.EquipeDto;

import java.util.List;

public interface EquipeService {
    List<EquipeDto> listerEquipes();

    boolean associer( Long employeeId, Long equipeId);

}
