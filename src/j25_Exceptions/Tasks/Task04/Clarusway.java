package j25_Exceptions.Tasks.Task04;

import java.util.ArrayList;

public class Clarusway {

//fields
private String okulAd;
private int maxOgrenciSayisi;
private ArrayList<It> ogrenciler;

    //constructor

    public Clarusway(String okulAd, int maxOgrenciSayisi) { // obje olusturdugumda hangi degerler gelsin istiyorum ??
        this.okulAd = okulAd;
        this.maxOgrenciSayisi = maxOgrenciSayisi;
       this.ogrenciler=new ArrayList<>(); // eklenen ogrenciler buraya dolacak
    }

//Methods

    public void ogrenciEkle(It ogrenci){
        ogrenciler.add(ogrenci);
    }

    public boolean isOkulDolu(){
        return ogrenciler.size() >= maxOgrenciSayisi;
    }
    //getter setter

    public String getOkulAd() {
        return okulAd;
    }

    public ArrayList<It> getOgrenciler() {
        return ogrenciler;
    }
//  toString

    @Override
    public String toString() {
        return "Clarusway{" +
                "okulAd='" + okulAd + '\'' +
                ", maxOgrenciSayisi=" + maxOgrenciSayisi +
                ", ogrenciler=" + ogrenciler +
                '}';
    }
}


