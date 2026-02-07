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

        //1. Step
List<String> days = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));

       // 2. Step
List<Double> gunlukKazanclar = new ArrayList<>();

Scanner scan= new Scanner(System.in);

// 3. Step get from user the daily earns
        
int i =0;

while (i< days.size()) {
    System.out.println(days.get(i) + ". gunun kazancini giriniz :");
    gunlukKazanclar.add(scan.nextDouble());
    i++;
}
        
        // Average
double average =getOrtalamaKazancim(gunlukKazanclar,days);
        System.out.println("ortalama = " + average);

        // The days above average

        System.out.println("The daily earns above average= " + getOrtalamaninUstuGunler(average, days, gunlukKazanclar));

        //The days below average

        System.out.println("The daily earns below average= " + getOrtlamaninAltindaOlanGunler(average, days, gunlukKazanclar));


    }

    private static List<String> getOrtlamaninAltindaOlanGunler(double ortalama, List<String> gunler, List<Double> gunlukKazanclar) {

        List<String> ortAltindakiGunler = new ArrayList<>();

        for (int i = 0; i < gunler.size(); i++) {
            if(ortalama> gunlukKazanclar.get(i)) {
                ortAltindakiGunler.add(gunler.get(i));
            }
        }
        return ortAltindakiGunler;
    }

    private static List<String> getOrtalamaninUstuGunler(double ortalama, List<String> gunler, List<Double> gunlukKazanclar) {
        List<String> ortUstuGunler = new ArrayList<>();

        for (int i = 0; i < gunler.size(); i++) {
            if(ortalama< gunlukKazanclar.get(i)) {
                ortUstuGunler.add(gunler.get(i));
            }
        }
        return ortUstuGunler;
    }

    private static double getOrtalamaKazancim(List<Double> gunlukKazanclar, List<String> gunler) {
            int toplam=0;
            for(Double avuc: gunlukKazanclar) {
                toplam+=avuc;
        }

        return  toplam /gunler.size();
    }


}/// Output

///  Monday. gunun kazancini giriniz :
 //       100
///  Tuesday. gunun kazancini giriniz :
//        134.6
///  Wednesday. gunun kazancini giriniz :
//        456.7
///   Thursday. gunun kazancini giriniz :
//        45.3
///   Friday. gunun kazancini giriniz :
//        78.4
///   Saturday. gunun kazancini giriniz :
//          34
///   Sunday. gunun kazancini giriniz :
//        12
///  average = 122.0
///  The daily earns above average = [Tuesday, Wednesday]
/// The daily earns below average = [Monday, Thursday, Friday, Saturday, Sunday]

