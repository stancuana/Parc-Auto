package com.company;

import java.util.ArrayList;

public class ParcAuto extends AutoVehicul{

    private ArrayList<AutoVehicul> autoVehiculs;


    public ParcAuto(ArrayList<AutoVehicul> autoVehiculs){
        this.autoVehiculs=autoVehiculs;
    }

    @Override
    public void updateNrImpatriculare(String nrInmatriculareNou) {
        for(AutoVehicul autoVehicul:autoVehiculs){

            autoVehicul.updateNrImpatriculare(nrInmatriculareNou);
        }
    }

    public void afisare(){

        for(AutoVehicul autoVehicul:autoVehiculs){

            System.out.println(autoVehicul.toString());;
        }
    }
}
