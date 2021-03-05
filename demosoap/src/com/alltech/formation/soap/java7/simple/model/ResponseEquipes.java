package com.alltech.formation.soap.java7.simple.model;

import java.util.List;

public class ResponseEquipes {
    private  List<Equipe> equipes;

    public ResponseEquipes(List<Equipe> equipes) {
        this.equipes = equipes;
    }

    public List<Equipe> getEquipes() {
        return equipes;
    }

    public void setEquipes(List<Equipe> equipes) {
        this.equipes = equipes;
    }
}
