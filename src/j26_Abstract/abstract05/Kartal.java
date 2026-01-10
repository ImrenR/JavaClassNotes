package j26_Abstract.abstract05;

import java.time.LocalDate;

public class Kartal extends Hayvan {


    public Kartal(String isim, int id, boolean vahsi, LocalDate dogumTarihi) {
        super(isim, id, vahsi, dogumTarihi);
    }

    @Override
    public String yiyecegi() {
        return "Et";
    }

    @Override
    public int yemekMiktari() {
        return 5;
    }

    @Override
    public int gunlukUykuSuresi() {
        return 115;
    }

    @Override
    public String sesi() {
        return "Ciglik";
    }
}
