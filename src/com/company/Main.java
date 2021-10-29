package com.company;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank();

        Tulajdonos t1 = new Tulajdonos("Én");
        Tulajdonos t2 = new Tulajdonos("Nem Én");
        Tulajdonos t3 = new Tulajdonos("Más Valaki");
        System.out.println(t2.getNev());
        t3.setNev("Valaki Más");

        BankiSzolgaltatas b0 = new BankiSzolgaltatas(t1);

        Szamla b1 = new Szamla(t1);
        b1.befizet(100000);
        b1.kivesz(1000000);
        b1.kivesz(1000);
        System.out.println(b1.getAktualisEgyenleg());
        b1.ujKartya("0000000000000000");

        Kartya b2 = new Kartya(t1, b1, "szám");
        b2.vasarlas(1000000);
        b2.vasarlas(10000);
        b2.getTulajdonos();
        System.out.println(b2.getKartyaSzam());

        HitelSzamla b3 = new HitelSzamla(t2, 100000);
        System.out.println(b3.getHitelkeret());
        b3.kivesz(1000000);
        b3.kivesz(1000);
        System.out.println(b3.getAktualisEgyenleg());

        MegtakaritasiSzamla b4 = new MegtakaritasiSzamla(t3);
        b4.befizet(100000);
        b4.setKamat(1.1);
        b4.kamatJovairas();
        System.out.println(b4.getKamat());
        b4.kivesz(10000000);
        b4.kivesz(1000);

        bank.getLegnagyobbEgyenleguSzamla(t2);
        System.out.println(bank.getOsszEgyenleg(t1));
        bank.szamlaNyitas(t1, 0);
        bank.szamlaNyitas(t3, 100000);
        System.out.println(bank.getOsszHitelkeret());

    }
}
