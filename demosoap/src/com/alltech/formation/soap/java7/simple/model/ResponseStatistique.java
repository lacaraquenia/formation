package com.alltech.formation.soap.java7.simple.model;

public class ResponseStatistique {

    private Statistique statistique;

    public ResponseStatistique(Statistique statistique){
        this.statistique=statistique;
    }

    public Statistique getStatistique() {
        return statistique;
    }

    public void setStatistique(Statistique statistique) {
        this.statistique = statistique;
    }
}
