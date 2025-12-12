package j15_DateTime;

import java.time.LocalDate;
import java.time.Month;

public class C01_LoacalDate {
    public static void main(String[] args) {
        // LocalDate  -> sadece gun-ay-yıl datatlarını tutar(stored)
         // Trick-> LocalDate variable için new keyword kullanılmaz

LocalDate bugun = LocalDate.now();
        System.out.println("bugun = " + bugun);
        System.out.println("bugun.getDayOfMonth() = " + bugun.getDayOfMonth());
        System.out.println("bugun.getDayOfWeek() = " + bugun.getDayOfWeek());


        System.out.println("**********");
        LocalDate falanTarih = LocalDate.of(1976,11,3);
        //Tanimlanan tarih sonrasi icin -> plus. , oncesi icin minus() meth kullanilir..
        System.out.println("falanTarih.plusYears(3).minusMonths(2).plusDays(23) = " + falanTarih.plusYears(3).minusMonths(2).plusDays(23));


    }
}
