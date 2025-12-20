package j15_DateTime;

import java.time.LocalDate;
import java.time.LocalTime;

public class C02_LocalTime {
    public static void main(String[] args) {
        // LocalTime  -> sadece saat-dakika-saniye datatlarını tutar(stored)
         // Trick-> LocalTimee variable için new keyword kullanılmaz

LocalTime suan = LocalTime.now();
        System.out.println(suan); // 17:25:22.743217


        System.out.println("suan.getHour() = " + suan.getHour()); // getHour() = 17
        System.out.println("suan.getNano() = " + suan.getNano()); // getNano() = 74991000
        System.out.println("suan.getSecond() = " + suan.getSecond()); // getSecond() = 52


        LocalTime lt1 =LocalTime.of(19,14,23);
        LocalTime lt2 = LocalTime.of(12,11,5);
        // Tanimlanan tarih sonrasi icin --> plus()
        // Tanimlanan tarih oncesi icin --> minus() meth kullanilir.

        System.out.println("Sonuc " + lt1.plusHours(2).minusMinutes(12).plusSeconds(45)); // = 21:03:08


        LocalTime loopStart = LocalTime.now();
        System.out.println("loopStart.getNano() = " + loopStart.getNano()); //getNano() = 582488000
        int toplam =0;
        for (int i = 0; i < 10000; i++) {
            toplam +=i;
        }
        
        
        
        
        
        
        
        
        LocalTime loopFinished = LocalTime.now();
        System.out.println("loopFinished.getNano() = " + loopFinished.getNano()); //getNano() = 582601000

        System.out.println("Loop run hizi = " + (loopFinished.getNano() - loopStart.getNano())); // = 113000-> performans hizi
        // bunlari performans hizinda kullaniriz,tepkime hizi vs ..
    }
}
