package com.company;

public class MegtakaritasiSzamla extends Szamla{
    public MegtakaritasiSzamla(Tulajdonos tulajdonos) {
        super(tulajdonos);
    }
    private double kamat;
    public static double alapKamat = .05;

    public int getKamat() {
        return (int)kamat;
    }

    public void setKamat(double kamat) {
        this.kamat = kamat;
    }

    @Override
    public boolean kivesz(int osszeg) {
        return super.kivesz(osszeg);
    }

    public void kamatJovairas(){
        kamat = alapKamat*aktualisEgyenleg;
        aktualisEgyenleg += kamat;
    }
}
