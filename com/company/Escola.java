package com.com.company;


import com.com.tipoPessoa.Aluno;

public class Escola extends Aluno {

    private String materiasEletivas;
    private String bimestre;
    private String semestre;
    private String reunião;

    public String getMateriasEletivas() {
        return materiasEletivas;
    }

    public void setMateriasEletivas(String materiasEletivas) {
        this.materiasEletivas = materiasEletivas;
    }

    public String getBimestre() {
        return bimestre;
    }

    public void setBimestre(String bimestre) {
        this.bimestre = bimestre;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getReunião() {
        return reunião;
    }

    public void setReunião(String reunião) {
        this.reunião = reunião;
    }
}