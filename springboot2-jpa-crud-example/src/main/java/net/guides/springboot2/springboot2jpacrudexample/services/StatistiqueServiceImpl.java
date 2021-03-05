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
        statistiqueAllEmployes=calculerStatistiques(datasSoapJava7.getAllEmployees().getEmployees());
    }

    private Statistique calculerStatistiques(List<Employee> employeeList){
        Statistique statistique=new Statistique();

        DoubleSummaryStatistics summaryStatisticsChiffreAffaires=employeeList
                .stream().mapToDouble(x->x.getCa().doubleValue()).summaryStatistics();

        DoubleSummaryStatistics summaryStatisticsSalaires=employeeList
                .stream().mapToDouble(x->x.getSalaire().doubleValue()).summaryStatistics();

        DoubleSummaryStatistics summaryStatisticsRentabilite=employeeList.stream()
                .mapToDouble(x->x.getCa().doubleValue()-x.getSalaire().doubleValue()).summaryStatistics();

        System.out.println("****************************************************************");

        //1-    le chiffre affaire total
        statistique.setChiffreAffairesTotal(summaryStatisticsChiffreAffaires.getSum());

        //2-    le benefice total (affaire - salaire)
        statistique.setBeneficeTotal(statistique.getChiffreAffairesTotal()-summaryStatisticsSalaires.getSum());

        //3-    le chiffre affaire max (nom de l 'employee + montant)
        statistique.setEmployeeChiffreAffairesMax(employeeList
                .stream().filter(x->x.getCa().doubleValue()==summaryStatisticsChiffreAffaires.getMax()).findFirst().orElse(new Employee()));

        //4-    le chiffre affaire  min  (nom de l 'employee + montant)
        statistique.setEmployeeChiffreAffairesMin(employeeList
                .stream().filter(x->x.getCa().doubleValue()==summaryStatisticsChiffreAffaires.getMin()).findFirst().orElse(new Employee()));

        System.out.println("CA total: " + statistique.getChiffreAffairesTotal());
        System.out.println("coût total salaires:  " + summaryStatisticsSalaires.getSum());
        System.out.println("benefice total(affaire - salaire): " + statistique.getBeneficeTotal());
        System.out.println("CA max: " + summaryStatisticsChiffreAffaires.getMax());
        System.out.println("CA min: " + summaryStatisticsChiffreAffaires.getMin());
        System.out.println("Rentabilité max: " + summaryStatisticsRentabilite.getMax());
        System.out.println("Rentabilité min: " + summaryStatisticsRentabilite.getMin());
        System.out.println("Rentabilité moyenne: " + summaryStatisticsRentabilite.getAverage());

        //5-    employee le plus rentable
        statistique.setEmployeePlusRentable(employeeList.stream()
                .filter(x->x.getCa().doubleValue()-x.getSalaire().doubleValue()==summaryStatisticsRentabilite.getMax())
                .findFirst().orElse(new Employee()));

        //6-    liste des employees les moins rentables
        statistique.getEmployeesPeuRentables().addAll(employeeList.stream()
                .filter(x->x.getCa().doubleValue()-x.getSalaire().doubleValue()<summaryStatisticsRentabilite.getAverage())
                .collect(Collectors.toList()));

        System.out.println("****************************************************************");

        return statistique;
    }
}
















