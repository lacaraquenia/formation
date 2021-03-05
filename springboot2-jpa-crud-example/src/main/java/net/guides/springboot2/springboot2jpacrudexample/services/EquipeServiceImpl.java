package net.guides.springboot2.springboot2jpacrudexample.services;

import net.guides.springboot2.springboot2jpacrudexample.dto.EmployeeDto;
import net.guides.springboot2.springboot2jpacrudexample.dto.EquipeDto;
import net.guides.springboot2.springboot2jpacrudexample.generated.soapclient.DatasSoapJava7;
import net.guides.springboot2.springboot2jpacrudexample.generated.soapclient.DatasSoapJava7WSService;
import net.guides.springboot2.springboot2jpacrudexample.generated.soapclient.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EquipeServiceImpl implements EquipeService {
    @Override
    public List<EquipeDto> listerEquipes() {
        DatasSoapJava7WSService datasSoapJava7WSService	= new DatasSoapJava7WSService();
        DatasSoapJava7 datasSoapJava7;
        datasSoapJava7 = datasSoapJava7WSService.getDatasSoapJava7WSPort();
        List<EquipeDto> tousEquipes=null;
        tousEquipes=datasSoapJava7.getAllEquipes().getEquipes().stream().map(equipe->
        {
            EquipeDto equipeDto=new EquipeDto();
            equipeDto.setNom(equipe.getNom());
             equipeDto.setEmployeeEntities(equipe.getEmployees().stream()
                    .map(emp-> convertirEmployeeAEmployeeDto(emp)).collect(Collectors.toList()));
            return equipeDto;
        }).collect(Collectors.toList());
        return tousEquipes;

    }

    public boolean associer( Long employeeId, Long equipeId){
        DatasSoapJava7WSService datasSoapJava7WSService	= new DatasSoapJava7WSService();
        DatasSoapJava7 datasSoapJava7;
        datasSoapJava7 = datasSoapJava7WSService.getDatasSoapJava7WSPort();
        //int sizeBeforeAssociation=datasSoapJava7.getEquipeById(equipeId).getEmployees().size();
        int sizeBeforeAssociation=datasSoapJava7.getEquipeById(equipeId).getEquipe().getEmployees().size();
        System.out.println("sizeBeforeAssociation: " + sizeBeforeAssociation);
        datasSoapJava7.associer(employeeId,equipeId);
        int sizeAfterAssociation=datasSoapJava7.getEquipeById(equipeId).getEquipe().getEmployees().size();
        System.out.println("sizeAfterAssociation: " + sizeAfterAssociation);
        return sizeBeforeAssociation+1==sizeAfterAssociation;
    }


    //TODO: DUPLIQUEEEEEEEEE!
    protected EmployeeDto convertirEmployeeAEmployeeDto(Employee employee){
        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setId(employee.getId());
        employeeDto.setEmailId(employee.getEmailId());
        employeeDto.setFirstName(employee.getFirstName());
        employeeDto.setLastName(employee.getLastName());
        employeeDto.setSalaire(employee.getSalaire());
        employeeDto.setCa(employee.getCa());
        return employeeDto;
    }

}
