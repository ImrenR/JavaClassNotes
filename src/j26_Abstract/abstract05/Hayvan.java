package j26_Abstract.abstract05;

import java.time.LocalDate;

public abstract class Hayvan {

private String isim;
private int id;
private boolean vahsi;
private LocalDate dogumTarihi;

public abstract String yiyecegi();
public abstract int yemekMiktari();
public abstract int gunlukUykuSuresi();
public abstract String sesi();

    public Hayvan(String isim, int id, boolean vahsi, LocalDate dogumTarihi) {
        this.isim = isim;
        this.id = id;
        this.vahsi = vahsi;
        this.dogumTarihi = dogumTarihi;
    }

    public String getIsim() {
        return isim;
    }

    public int getId() {
        return id;
    }

    public boolean isVahsi() {
        return vahsi;
    }

    public LocalDate getDogumTarihi() {
        return dogumTarihi;
    }

    public void setIsim(String isim) {
        if(isim==null || isim.trim().isEmpty()) {
            throw new IllegalArgumentException(("isim bos olamaz!"));
        }
        this.isim=isim;
    }

    public void setId(int id) {

        if(id<=0){
            throw new IllegalArgumentException("Id 0 dan kucuk olamaz");

        }
        this.id = id;
    }

    public void setVahsi(boolean vahsi) {
        this.vahsi = vahsi;
    }

    public void setDogumTarihi(LocalDate dogumTarihi) {
        if(dogumTarihi.isAfter(LocalDate.now())){
            throw new IllegalArgumentException("Gelecekten bir tarih olamaz");

        }
        this.dogumTarihi = dogumTarihi;
    }

    @Override
    public String toString() {
        return
                "isim='" + isim +
                ", id=" + id +
                ", vahsi=" + vahsi +
                ", dogumTarihi=" + dogumTarihi +
                        ", sesi =" + sesi() +
                        ", uyuSuresi=" + gunlukUykuSuresi() +
                        ",yemekMiktari=" + yemekMiktari() +
                        ", yiyecegi =" + yiyecegi() +
                '}';
    }
}
