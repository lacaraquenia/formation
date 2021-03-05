package com.alltech.formation.soap.java7.simple.model;

public class ResponseEquipe {

    private Equipe equipe;

    public ResponseEquipe(Equipe equipe){
        this.equipe=equipe;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }
}
