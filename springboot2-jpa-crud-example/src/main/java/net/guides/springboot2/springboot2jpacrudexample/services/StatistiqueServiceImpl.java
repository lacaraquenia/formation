package net.guides.springboot2.springboot2jpacrudexample.services;

import net.guides.springboot2.springboot2jpacrudexample.generated.soapclient.DatasSoapJava7;
import net.guides.springboot2.springboot2jpacrudexample.generated.soapclient.DatasSoapJava7WSService;
import net.guides.springboot2.springboot2jpacrudexample.generated.soapclient.Employee;
import net.guides.springboot2.springboot2jpacrudexample.generated.soapclient.Statistique;
import org.springframework.stereotype.Service;

import java.util.DoubleSummaryStatistics;
import java.util.List;

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

        //le chiffre affaire total
        statistiqueAllEmployes.setChiffreAffairesTotal(summaryStatisticsChiffreAffaires.getSum());

        //le benefice total (affaire - salaire)
        statistiqueAllEmployes.setBeneficeTotal(statistiqueAllEmployes.getChiffreAffairesTotal()-summaryStatisticsSalaires.getSum());
        double chiffreAffairesMax=summaryStatisticsChiffreAffaires.getMax();
        double chiffreAffairesMin=summaryStatisticsChiffreAffaires.getMin();
        double beneficeMoyen=summaryStatisticsChiffreAffaires.getAverage()-summaryStatisticsSalaires.getAverage();
        //double beneficeMax=summaryStatistic

        //le chiffre affaire max (nom de l 'employee + montant)
        statistiqueAllEmployes.setEmployeeChiffreAffairesMax(datasSoapJava7.getAllEmployees().getEmployees()
                .stream().filter(x->x.getCa().doubleValue()==chiffreAffairesMax).findFirst().orElse(new Employee()));
        //le chiffre affaire  min  (nom de l 'employee + montant)
        statistiqueAllEmployes.setEmployeeChiffreAffairesMin(datasSoapJava7.getAllEmployees().getEmployees()
                .stream().filter(x->x.getCa().doubleValue()==chiffreAffairesMin).findFirst().orElse(new Employee()));

        //employee le plus rentable
        /*datasSoapJava7.getAllEmployees().getEmployees().stream()
                .filter(x->x.getCa().doubleValue()-x.getSalaire().doubleValue()==beneficeMoyen).findFirst().orElse(new Employee());*/
        //TODO
        //return null;
    }

    private Statistique calculerStatistiques(List<Employee> employeeList){
        //TODO
        return null;
    }
}
