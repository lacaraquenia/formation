package net.guides.springboot2.springboot2jpacrudexample.datas;

import net.guides.springboot2.springboot2jpacrudexample.dto.EmployeeDto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MockEmployee {
    private static List<EmployeeDto> datas;

    public static List<EmployeeDto> getDatas() {
        return datas;
    }

    public static void setDatas(List<EmployeeDto> datas) {
        MockEmployee.datas = datas;
    }

    public static void init(){
        System.out.println("init MockEmployee");
        Optional.ofNullable(datas).ifPresent(List::clear);
        datas=new ArrayList<>();
        //(long id,String firstName, String lastName, String emailId, BigDecimal ca,BigDecimal salaire )

        datas.add(
            new EmployeeDto(1L,"NONaaaa","bbbb","adqdaa@bbb.fr", BigDecimal.valueOf(10L), BigDecimal.valueOf(500))
        );
        datas.add(
            new EmployeeDto(2L,"fddsf","sqfsdfs","qddaaa@bbb.fr", BigDecimal.valueOf(100L), BigDecimal.valueOf(500))
        );
        datas.add(
            new EmployeeDto(3L,"fsdf","gfdgd","qdd@bbb.fr", BigDecimal.valueOf(1000L), BigDecimal.valueOf(5000))
        );
        datas.add(
            new EmployeeDto(4L,"sdgsdgdg","gdgdsgsg","dqd@bbb.fr", BigDecimal.valueOf(1000L), BigDecimal.valueOf(5))
        );
        datas.add(
            new EmployeeDto(6L,"gfhd","grdg","qdq@bbb.fr", BigDecimal.valueOf(1000L), BigDecimal.valueOf(50))
        );
       datas.add(
                new EmployeeDto(7L,"gfdfdxhd","grdfedsfsg","aaaaaa@bbb.fr", BigDecimal.valueOf(1020L), BigDecimal.valueOf(1000))
            );
       datas.add(
                new EmployeeDto(8L,"fdxfgdxgx","grfdfsfdg","jjjj@bbb.fr", BigDecimal.valueOf(2000L), BigDecimal.valueOf(3000))
            );
       datas.add(
                new EmployeeDto(9L,"dxgdfgffffff","fffgrdg","iiiii@bbb.fr", BigDecimal.valueOf(100L), BigDecimal.valueOf(200))
            );


        // ajout des datas
    }
}
