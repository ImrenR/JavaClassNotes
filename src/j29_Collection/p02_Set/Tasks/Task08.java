package j29_Collection.p02_Set.Tasks;

import java.util.Arrays;
import java.util.HashSet;

public class Task08 {
    /* TASK :
    Main method altinda bir double hashSet olusturunuz.
    ve bu seti, adi setOlustur ve return tipi hashSet double olan
    ayri bir metod altinda 3.23 , 3.10 , 5.12 , 10.12 , 23.12 degerlerini kullanarak doldurun.
    Adini toplaminiAl koyacagimiz ve parametre olarak bir Double(Çift) hashSet kabul edecek ayri bir method olusturarak
    hashSetin degerlerinin toplamini alınız.

    Çıktı--> sonuc = 44.69
     */
    public static void main(String[] args) {

HashSet<Double> hashSet=new HashSet<>();

hashSet=setOlustur(hashSet);
  double sonuc =toplaminiAl(hashSet);
        System.out.println("sonuc = " + sonuc); // Sonuc 44.69
    }

    private static double toplaminiAl(HashSet<Double> hashSet) {
        double toplam=0;
        for (Double avuc:hashSet){
            toplam+=avuc;

        }
return toplam;
    }

    private static HashSet<Double> setOlustur(HashSet<Double> hashSet) {
        hashSet.add(3.23);
        hashSet.add(3.10);
        hashSet.add(5.12);
        hashSet.add(10.12);
        hashSet.add(23.12);
        return hashSet;
    }
}
