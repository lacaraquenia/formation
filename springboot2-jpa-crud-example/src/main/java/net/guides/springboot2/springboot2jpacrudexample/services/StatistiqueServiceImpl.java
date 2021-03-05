package net.guides.springboot2.springboot2jpacrudexample.services;

import net.guides.springboot2.springboot2jpacrudexample.generated.soapclient.DatasSoapJava7;
import net.guides.springboot2.springboot2jpacrudexample.generated.soapclient.DatasSoapJava7WSService;
import net.guides.springboot2.springboot2jpacrudexample.generated.soapclient.Employee;
import net.guides.springboot2.springboot2jpacrudexample.generated.soapclient.Statistique;
import org.springframework.stereotype.Service;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StatistiqueServiceImpl  implements  StatistiqueService{

    private Statistique statistiqueAllEmployes=null;

    @Override
    public Statistique getStatistiqueAllEmployees() {
        if(null==statistiqueAllEmployes){
            statistiqueAllEmployes=new Statistique();
        }
        calculerStatistiqueAllEmployees();
        return statistiqueAllEmployes;
    }

    private void calculerStatistiqueAllEmployees(){
        DatasSoapJava7WSService datasSoapJava7WSService	= new DatasSoapJava7WSService();
        DatasSoapJava7 datasSoapJava7;
        datasSoapJava7 = datasSoapJava7WSService.getDatasSoapJava7WSPort();

        DoubleSummaryStatistics summaryStatisticsChiffreAffaires=datasSoapJava7.getAllEmployees().getEmployees()
                .stream().mapToDouble(x->x.getCa().doubleValue()).summaryStatistics();

        DoubleSummaryStatistics summaryStatisticsSalaires=datasSoapJava7.getAllEmployees().getEmployees()
                .stream().mapToDouble(x->x.getSalaire().doubleValue()).summaryStatistics();

        DoubleSummaryStatistics summaryStatisticsRentabilite=datasSoapJava7.getAllEmployees().getEmployees().stream()
                .mapToDouble(x->x.getCa().doubleValue()-x.getSalaire().doubleValue()).summaryStatistics();

        System.out.println("****************************************************************");

        //1-    le chiffre affaire total
        statistiqueAllEmployes.setChiffreAffairesTotal(summaryStatisticsChiffreAffaires.getSum());

        //2-    le benefice total (affaire - salaire)
        statistiqueAllEmployes.setBeneficeTotal(statistiqueAllEmployes.getChiffreAffairesTotal()-summaryStatisticsSalaires.getSum());
        double chiffreAffairesMax=summaryStatisticsChiffreAffaires.getMax();
        double chiffreAffairesMin=summaryStatisticsChiffreAffaires.getMin();
        double beneficeMoyen=summaryStatisticsChiffreAffaires.getAverage()-summaryStatisticsSalaires.getAverage();

        //3-    le chiffre affaire max (nom de l 'employee + montant)
        statistiqueAllEmployes.setEmployeeChiffreAffairesMax(datasSoapJava7.getAllEmployees().getEmployees()
                .stream().filter(x->x.getCa().doubleValue()==chiffreAffairesMax).findFirst().orElse(new Employee()));

        //4-    le chiffre affaire  min  (nom de l 'employee + montant)
        statistiqueAllEmployes.setEmployeeChiffreAffairesMin(datasSoapJava7.getAllEmployees().getEmployees()
                .stream().filter(x->x.getCa().doubleValue()==chiffreAffairesMin).findFirst().orElse(new Employee()));

        System.out.println("CA total: " + statistiqueAllEmployes.getChiffreAffairesTotal());
        System.out.println("coût total salaires:  " + summaryStatisticsSalaires.getSum());
        System.out.println("benefice total(affaire - salaire): " + statistiqueAllEmployes.getBeneficeTotal());
        System.out.println("CA max: " + summaryStatisticsChiffreAffaires.getMax());
        System.out.println("CA min: " + summaryStatisticsChiffreAffaires.getMin());
        System.out.println("Rentabilité max: " + summaryStatisticsRentabilite.getMax());
        System.out.println("Rentabilité min: " + summaryStatisticsRentabilite.getMin());
        System.out.println("Rentabilité moyenne: " + summaryStatisticsRentabilite.getAverage());

        //5-    employee le plus rentable
        statistiqueAllEmployes.setEmployeePlusRentable(datasSoapJava7.getAllEmployees().getEmployees().stream()
                .filter(x->x.getCa().doubleValue()-x.getSalaire().doubleValue()==summaryStatisticsRentabilite.getMax()).findFirst().orElse(new Employee()));

        //List<Employee> employeesPeuRentables=null;
        //employeesPeuRentables=datasSoapJava7.getAllEmployees().getEmployees().stream()
        statistiqueAllEmployes.setEmployeesPeuRentables(datasSoapJava7.getAllEmployees().getEmployees().stream()
                .filter(x->x.getCa().doubleValue()-x.getSalaire().doubleValue()<summaryStatisticsRentabilite.getAverage()).collect(Collectors.toList()));

        System.out.println("****************************************************************");
    }

    private Statistique calculerStatistiques(List<Employee> employeeList){
        //TODO
        return null;
    }
}
















