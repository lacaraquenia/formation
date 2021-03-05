package net.guides.springboot2.springboot2jpacrudexample.datas;

import net.guides.springboot2.springboot2jpacrudexample.dto.EquipeDto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MockEquipe {

    private static List<EquipeDto> datas;

    public static List<EquipeDto> getDatas() {
        return datas;
    }

    public static void setDatas(List<EquipeDto> datas) {
        MockEquipe.datas = datas;
    }

    public static void init(){
        System.out.println("init MockEmployee");
        Optional.ofNullable(datas).ifPresent(List::clear);
        datas=new ArrayList<>();
        EquipeDto equipeDto1 = new EquipeDto();
        equipeDto1.setNom("equipê 1");
        equipeDto1.setEmployeeEntities(MockEmployee.getDatas()
                .stream().filter(employeeEntity -> Arrays.asList(1L,2L,3L).contains(employeeEntity.getId())).collect(Collectors.toList()));
        datas.add(equipeDto1);
        EquipeDto equipeDto2 = new EquipeDto();
        equipeDto2.setNom("equipê 1");
        equipeDto2.setEmployeeEntities(MockEmployee.getDatas()
                .stream().filter(employeeEntity -> Arrays.asList(4L,5L,6L).contains(employeeEntity.getId())).collect(Collectors.toList()));
        datas.add(equipeDto2);
        EquipeDto equipeDto3 = new EquipeDto();
        equipeDto3.setNom("equipê 1");
        equipeDto3.setEmployeeEntities(MockEmployee.getDatas()
                .stream().filter(employeeEntity -> Arrays.asList(7L,8L,9L).contains(employeeEntity.getId())).collect(Collectors.toList()));
        datas.add(equipeDto3);
        // ajout des datas
    }
}
