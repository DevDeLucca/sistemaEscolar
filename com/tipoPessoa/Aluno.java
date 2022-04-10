package com.com.tipoPessoa;

public class Aluno extends People {

    private String nomeMateria;
    private double notaPMateria;
    private double mdiaPMateria;
    private String avalicoesEletivas;
    private double notaTotProva;

    public String getNomeMateria() {
        return nomeMateria;
    }

    public void setNomeMateria(String nomeMateria) {
        this.nomeMateria = nomeMateria;
    }

    public double getNotaPMateria() {
        return notaPMateria;
    }

    public void setNotaPMateria(double notaPMateria) {
        this.notaPMateria = notaPMateria;
    }

    public double getMdiaPMateria() {
        return mdiaPMateria;
    }

    public void setMdiaPMateria(double mdiaPMateria) {
        this.mdiaPMateria = mdiaPMateria;
    }

    public String getAvalicoesEletivas() {
        return avalicoesEletivas;
    }

    public void setAvalicoesEletivas(String avalicoesEletivas) {
        this.avalicoesEletivas = avalicoesEletivas;
    }

    public double getNotaTotProva() {
        return notaTotProva;
    }

    public void setNotaTotProva(double notaTotProva) {
        this.notaTotProva = notaTotProva;
    }
}