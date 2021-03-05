package net.guides.springboot2.springboot2jpacrudexample.services;

import net.guides.springboot2.springboot2jpacrudexample.dto.EmployeeDto;
import net.guides.springboot2.springboot2jpacrudexample.generated.soapclient.DatasSoapJava7;
import net.guides.springboot2.springboot2jpacrudexample.generated.soapclient.DatasSoapJava7WSService;
import net.guides.springboot2.springboot2jpacrudexample.generated.soapclient.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
@Service
public class EmployeeServiceImpl implements EmployeeService {



/*
    @Autowired
    DatasSoapJava7 datasSoapJava7;
    //@ComponentScan({"net.guides.springboot2.springboot2jpacrudexample.generated.soapclient.DatasSoapJava7"})



    @Override
    public List<EmployeeDto> listerEmployees() {
        return datasSoapJava7.getAllEmployees().getEmployees().stream()
                .map(employee -> convertirEmployeeAEmployeeDto(employee)).collect(Collectors.toList());
    }


    @Override
    public EmployeeDto creerEmployee(EmployeeDto employeeACreer){
        EmployeeDto employeeDtoCree=null;
        Employee employeeCree=datasSoapJava7.createEmployee(convertirEmployeeDtoAEmployee(employeeACreer)).getEmployee();
        employeeDtoCree=convertirEmployeeAEmployeeDto(employeeCree);
        return employeeDtoCree;
    }


    @Override
    public EmployeeDto chercherEmployee(Long idEmployee){
        return convertirEmployeeAEmployeeDto(datasSoapJava7.getEmployeeById(idEmployee).getEmployee());
    }

    @Override
    public EmployeeDto modifierEmployee(Long idEmployee,EmployeeDto employee){
        EmployeeDto employeeModifieDto=null;
        Employee employeeModifie=datasSoapJava7.updateEmployee(idEmployee,convertirEmployeeDtoAEmployee(employee)).getEmployee();
        employeeModifieDto=convertirEmployeeAEmployeeDto(employeeModifie);
        return employeeModifieDto;
    }

    @Override
    public boolean supprimerEmployee(Long id){
        boolean isDeleted=false;
        int sizeAvantDeletion=datasSoapJava7.getAllEmployees().getEmployees().size();
        int sizeApresDeletion=datasSoapJava7.deleteEmployee(id).getEmployees().size();
        isDeleted=sizeAvantDeletion-1==sizeApresDeletion;
        return isDeleted;
    }
*/

    private DatasSoapJava7WSService datasSoapJava7WSService;
    private DatasSoapJava7 datasSoapJava7;

    Supplier<DatasSoapJava7> getDataSoapJava7=()->{
        if(null==datasSoapJava7WSService){
            datasSoapJava7WSService	= new DatasSoapJava7WSService();
            datasSoapJava7 = datasSoapJava7WSService.getDatasSoapJava7WSPort();
        }
        return datasSoapJava7;
    };

    @Override
    public List<EmployeeDto> listerEmployees() {
        return getDataSoapJava7.get().getAllEmployees().getEmployees().stream()
                .map(employee -> convertirEmployeeAEmployeeDto(employee)).collect(Collectors.toList());
    }


    @Override
    public EmployeeDto creerEmployee(EmployeeDto employeeACreer){
        EmployeeDto employeeDtoCree=null;
        Employee employeeCree=getDataSoapJava7.get().createEmployee(convertirEmployeeDtoAEmployee(employeeACreer)).getEmployee();
        employeeDtoCree=convertirEmployeeAEmployeeDto(employeeCree);
        return employeeDtoCree;
    }



    @Override
    public EmployeeDto chercherEmployee(Long idEmployee){
        return convertirEmployeeAEmployeeDto(getDataSoapJava7.get().getEmployeeById(idEmployee).getEmployee());
    }



    @Override
    public EmployeeDto modifierEmployee(Long idEmployee,EmployeeDto employee){
        EmployeeDto employeeModifieDto=null;
        Employee employeeModifie=getDataSoapJava7.get().updateEmployee(idEmployee,convertirEmployeeDtoAEmployee(employee)).getEmployee();
        employeeModifieDto=convertirEmployeeAEmployeeDto(employeeModifie);
        return employeeModifieDto;
    }

    @Override
    public boolean supprimerEmployee(Long id){
        boolean isDeleted=false;
        int sizeAvantDeletion=getDataSoapJava7.get().getAllEmployees().getEmployees().size();
        int sizeApresDeletion=getDataSoapJava7.get().deleteEmployee(id).getEmployees().size();
        isDeleted=sizeAvantDeletion-1==sizeApresDeletion;
        return isDeleted;
    }


    /********************************************Méthodes utilitaires*/
    protected Employee convertirEmployeeDtoAEmployee(EmployeeDto employeeDto){
        Employee employee=new Employee();
        employee.setId(employeeDto.getId());
        employee.setEmailId(employeeDto.getEmailId());
        employee.setFirstName(employeeDto.getFirstName());
        employee.setLastName(employeeDto.getLastName());
        employee.setSalaire(employeeDto.getSalaire());
        employee.setCa(employeeDto.getCa());
        return employee;
    }

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
