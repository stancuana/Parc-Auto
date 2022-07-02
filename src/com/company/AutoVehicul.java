package com.company;

public class AutoVehicul extends AutoMobil{


    private String numeAutovehicul;
    private String nrDeInmatriculare;


    public AutoVehicul(String numeAutovehicul, String nrDeInmatriculare) {

        this.numeAutovehicul=numeAutovehicul;
        this.nrDeInmatriculare=nrDeInmatriculare;
    }

    public AutoVehicul() {
    }


    public String getNumeAutovehicul() {
        return numeAutovehicul;
    }

    public void setNumeAutovehicul(String numeAutovehicul) {
        this.numeAutovehicul = numeAutovehicul;
    }

    public String getNrDeInmatriculare() {
        return nrDeInmatriculare;
    }

    public void setNrDeInmatriculare(String nrDeInmatriculare) {
        this.nrDeInmatriculare = nrDeInmatriculare;
    }


    @Override
    public String toString() {
        return "Nume autovehicul: " + this.numeAutovehicul + "\n" +
                "Nr de inmatriculare: " + this.nrDeInmatriculare + "\n";
    }


    @Override
    public void updateNrImpatriculare(String nrInmatriculareNou) {

        this.setNrDeInmatriculare(nrInmatriculareNou);
        this.getNrDeInmatriculare();

    }
}
