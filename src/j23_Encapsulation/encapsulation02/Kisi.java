package j23_Encapsulation.encapsulation02;

import javax.swing.text.Style;

public class Kisi {//pojo Class
    /* task
Kisi pojo class için fields-> ad, soyad, password(String), yas
tum field'ları kullanıcı görebilmeli ve password haric update edebilmeli
(password encapsulated update edilmemeli.)
yas variable negatif değer girmeye karsı encapsulated

runner class'da obj ile field ları print eden code create ediniz
 */
 // 1. step->fields

private String ad;
private String soyad;
private String password;
private int yas;


// 2. step-> const

    public Kisi(String ad, int yas, String password, String soyad) {
        this.ad = ad;
        this.yas =Math.abs(yas);
        this.password = password;
        this.soyad = soyad;
    }


    // 3. step->getter-setter

    public String getAd() {
        return ad;
    }

    public int getYas() {
        return yas;
    }

    public String getPassword() {
        return password;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

// 4. step-> toString


    @Override
    public String toString() {
        return
                "ad='" + ad +
                ", soyad='" + soyad +
                ", password='" + password +
                ", yas=" + yas
                ;
    }
}
