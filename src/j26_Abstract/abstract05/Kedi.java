package j26_Abstract.abstract05;

import java.time.LocalDate;

public class Kedi extends Hayvan {


    public Kedi(String isim, int id, boolean vahsi, LocalDate dogumTarihi) {
        super(isim, id, vahsi, dogumTarihi);
    }

    @Override
    public String yiyecegi() {
        return "Mama";
    }

    @Override
    public int yemekMiktari() {
        return 10;
    }

    @Override
    public int gunlukUykuSuresi() {
        return 14;
    }

    @Override
    public String sesi() {
        return "Meow";
    }
}
