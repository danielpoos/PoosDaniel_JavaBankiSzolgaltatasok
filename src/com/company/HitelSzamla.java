package com.company;

public class HitelSzamla extends Szamla{
    private int hitelkeret;

    public HitelSzamla(Tulajdonos tulajdonos, int hitelkeret) {
        super(tulajdonos);
        this.hitelkeret = hitelkeret;
    }

    public int getHitelkeret() {
        return hitelkeret;
    }

    @Override
    public boolean kivesz(int osszeg){
        boolean eleg;
        if (osszeg > hitelkeret+aktualisEgyenleg) eleg = false;
        else {
            eleg = true;
            aktualisEgyenleg -=osszeg;
        }
        return eleg;
    }
}
