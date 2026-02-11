package j25_Exceptions.Tasks.Task04;

import java.util.ArrayList;

public class Clarusway {

private String okulAd;
private int maxOgrenciSayisi;
private ArrayList<It> ogrenciler;




    public Clarusway(String okulAd, int maxOgrenciSayisi) {
        this.okulAd = okulAd;
        this.maxOgrenciSayisi = maxOgrenciSayisi;
        this.ogrenciler=new ArrayList<>();

    }

    public  void ogrenciEkle(It ogrenci){
        ogrenciler.add(ogrenci);
    }

    public boolean isOkulDolu(){
        return ogrenciler.size() >= maxOgrenciSayisi;
    }


    public ArrayList<It> getOgrenciler() {
        return ogrenciler;
    }

    public String getOkulAd() {
        return okulAd;
    }

    @Override
    public String toString() {
        return "Clarusway{" +
                "okulAd='" + okulAd + '\'' +
                ", maxOgrenciSayisi=" + maxOgrenciSayisi +
                ", ogrenciler=" + ogrenciler +
                '}';
    }
}


