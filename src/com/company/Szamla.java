package com.company;

public class Szamla extends BankiSzolgaltatas {
    protected int aktualisEgyenleg;

    public int getAktualisEgyenleg() {
        return aktualisEgyenleg;
    }

    public Szamla(Tulajdonos tulajdonos) {
        super(tulajdonos);
    }

    public void befizet(int osszeg){
        aktualisEgyenleg+=osszeg;
    }
    public boolean kivesz(int osszeg){
        boolean eleg;
        if (osszeg > aktualisEgyenleg) eleg = false;
        else {
            eleg = true;
            aktualisEgyenleg -=osszeg;
        }
        return eleg;
    }
}
