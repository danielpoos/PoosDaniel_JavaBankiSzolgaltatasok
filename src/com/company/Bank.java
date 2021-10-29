package com.company;

import java.util.*;

public class Bank {
    List<Szamla> szamlaLista;
    long osszHitel = 0;

    public Bank() {
        this.szamlaLista = new ArrayList<>();
    }

    public Szamla szamlaNyitas(Tulajdonos tulajdonos, int hitelkeret){
        Szamla sz;
        if (hitelkeret == 0) sz = new MegtakaritasiSzamla(tulajdonos);
        else if (hitelkeret < 0) {
            sz = new HitelSzamla(tulajdonos,hitelkeret*-1);
            osszHitel += (hitelkeret*-1);
        }
        else{
            sz = new HitelSzamla(tulajdonos, hitelkeret);
            osszHitel += (hitelkeret);
        }
        szamlaLista.add(sz);
        return sz;
    }
    public Szamla getLegnagyobbEgyenleguSzamla(Tulajdonos tulajdonos){
        Szamla sz = new Szamla(tulajdonos);
        for (Szamla szamla:szamlaLista) {
            if (szamla.aktualisEgyenleg > sz.getAktualisEgyenleg() || szamla.getTulajdonos() == tulajdonos) szamla.aktualisEgyenleg=sz.getAktualisEgyenleg();
        }
        return sz;
    }
    public int getOsszEgyenleg(Tulajdonos tulajdonos){
        int ossz = 0;
        for (Szamla szamla:szamlaLista) {
            if (szamla.getTulajdonos() == tulajdonos) ossz += szamla.getAktualisEgyenleg();
        }
        return ossz;
    }
    public long getOsszHitelkeret(){
        return osszHitel;
    }

}
