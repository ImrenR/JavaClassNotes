package j25_Exceptions.Tasks.Task04;

public class It {

    //fields

    private String ad;
   private String soyad;
    private int yas;

//Constructer


    public It(String ad, int yas, String soyad) {
        this.ad = ad;
        this.yas = yas;
        this.soyad = soyad;
    }

    //getter setter

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public int getYas() {
        return yas;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    @Override
    public String toString() {
        return "It{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", yas=" + yas +
                '}';
    }
}
