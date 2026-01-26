package Projects.Market;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MarketKayseri {
//  1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
    static List<String>  days=new ArrayList<>(Arrays.asList("Monday","Thusday","Wednesday","Thursday","Friday","Saturday","Sunday"));
    //* 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
    static ArrayList<Double> gunlukKazanc=new ArrayList<>();
    static ArrayList<String> ortalamaUstuGunler=new ArrayList<>();// ortalama üstü günleri
    static ArrayList<String> ortalamaAltıGunler=new ArrayList<>();
    static double ortalama;
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Marketimize hoşgeldiniz veresiye yoktur:)");
        int i=0;
        while (i<7){
            System.out.println("How much did you earn on "+days.get(i));
            gunlukKazanc.add(scanner.nextDouble());// günlük kazancımızı listeye ekledik
            i++;
        }
        System.out.println(gunlukKazanc);
        //4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
         ortalama=getOrtalamaKazanc(gunlukKazanc);// Haftalık ortalama kazancı retur edecek
        System.out.println("Haftalık ortalamanız: "+ortalama);
         ortalamaninUstundeKazancGunleri(ortalama);
         ortalamaAltıGunlerKazacGunleri(ortalama);
    }

    private static void ortalamaAltıGunlerKazacGunleri(double ortalama) {
        for (int i = 0; i < gunlukKazanc.size(); i++) {
            if (ortalama > gunlukKazanc.get(i)) {//ortalama gunluk kazancın i'nin elemanından daha büyükse
                ortalamaAltıGunler.add(days.get(i));
            }

        }
        System.out.println("Ortalamanın altında olan günler: "+ortalamaAltıGunler);
    }
    private static void ortalamaninUstundeKazancGunleri(double ortalama) {
        for (int i = 0; i < gunlukKazanc.size(); i++) {
            if(ortalama<gunlukKazanc.get(i)){//ortalama gunluk kazancın i'nin elemanından daha küçükse
                ortalamaUstuGunler.add(days.get(i));
            }

        }
        System.out.println("Ortalamının üstünde olan Günler: "+ ortalamaUstuGunler);
    }

    private static double getOrtalamaKazanc(ArrayList<Double> gunlukKazanc) {
        double sum=0;
        for (Double herGun : gunlukKazanc) {
            sum+= herGun;
        }
        System.out.println("Haftalık ortalama kazancınız: "+sum/ gunlukKazanc.size());
        return sum/ gunlukKazanc.size();// ortalamayı hesapladık
    }}

//    5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
//            *            for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
// *            ortalama kazançtan yüksekse o günleri return yap.



