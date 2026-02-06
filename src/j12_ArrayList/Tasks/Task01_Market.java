package j12_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;



public class Task01_Market {
    /* TASK :
     * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
     * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
     *
     * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
     * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
     * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
     * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
     * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
     * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     * 			 ortalama kazançtan yüksekse o günleri return yap.
     * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
     * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     * 			 ortalama kazançtan aşağıysa o günleri return yap.
     * */


    public static void main(String[] args) {

List<String> gunler = new ArrayList<>(Arrays.asList("Pazartesi", "Sali", "Carsamba", "Persembe","Cuma","Cumartesi","Pazar"));
List<Double> gunlukKazanclar= new ArrayList<>();

Scanner scan= new Scanner(System.in);

// 3. Adim Kullanicidan 7 gunluk kazanci al
        
        int i=0;
        while (i < gunler.size()) {
            System.out.println( gunler.get(i) + ". kazancini giriniz :" );
            gunlukKazanclar.add(scan.nextDouble());
            i++;
        }
        
        // Ortalama
        
        double ortalama = getOrtalamaKazancin(gunlukKazanclar);
        System.out.println("ortalama = " + ortalama);
        // Ortalamanin ustu 

        System.out.println( "Ortalamanin ustunde kazanc olan gunler: " + getOrtalamaninUstundeKAzancGunler(gunler,gunlukKazanclar,ortalama));
    // ortalamanin alti

        System.out.println( "Ortalama" + getOrtalamaninAltiKAzancGunleri(gunler,gunlukKazanclar,ortalama));



    }

    private static List<String> getOrtalamaninAltiKAzancGunleri(List<String> gunler, List<Double> gunlukKazanclar, double ortalama) {
List<String> result = new ArrayList<>();

        for (int i = 0; i < gunlukKazanclar.size(); i++) {
            if (gunlukKazanclar.get(i)< ortalama) {
                result.add(gunler.get(i));
            }
        }
return result;
    }

    private static List<String> getOrtalamaninUstundeKAzancGunler(List<String> gunler, List<Double> gunlukKazanclar, double ortalama) {
    List<String> result = new ArrayList<>();
        for (int i = 0; i < gunlukKazanclar.size(); i++) {
            if(gunlukKazanclar.get(i) > ortalama) {
                result.add(gunler.get(i));
            }

        }
        return result;


    }

    private static double getOrtalamaKazancin(List<Double> gunlukKazanclar) {
    double toplam =0;
    for (double each:gunlukKazanclar) {
        toplam +=each;
    }

   return toplam/gunlukKazanclar.size();

    }


}
