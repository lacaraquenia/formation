package com.alltech.formation.soap.java7.simple.datas;

import com.alltech.formation.soap.java7.simple.model.Statistique;

public class DatasStatistique {

    private static Statistique statistiqueAllEmployees=null;

    protected static Statistique getStatistiqueAllEmployees(){
        if(null==statistiqueAllEmployees){
            statistiqueAllEmployees=new Statistique();
        }
        return statistiqueAllEmployees;
    }

    protected static Statistique calculerStatistiqueAllEmployees(){
        //double chiffreAffairesTotal=Datas.getEmployees().st
        //TODO
        return null;
    }
}
