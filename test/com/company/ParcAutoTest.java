package com.company;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ParcAutoTest {

    @Test
    public void test(){

        Masina masina=new Masina("Masina","SB66FLY");
        Autobuz autobuz=new Autobuz("Autobuz","VL67GHN");

        ArrayList<AutoVehicul> autoVehicule=new ArrayList<>();

        autoVehicule.add(masina);
        autoVehicule.add(autobuz);

        ParcAuto parcAuto=new ParcAuto(autoVehicule);
        System.out.println("............Afisare.............");
        parcAuto.afisare();
        System.out.println("............Update Nr Impatriculare.............");
        parcAuto.updateNrImpatriculare("Sb67HHH");
        parcAuto.afisare();


    }

}