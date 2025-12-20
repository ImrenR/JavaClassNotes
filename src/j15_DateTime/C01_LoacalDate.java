package j15_DateTime;

import java.time.LocalDate;
import java.time.Month;

public class C01_LoacalDate {
    public static void main(String[] args) {
        // LocalDate  -> sadece gun-ay-yıl datatlarını tutar(stored)
         // Trick-> LocalDate variable için new keyword kullanılmaz

   LocalDate bugun = LocalDate.now();
        System.out.println("bugun = " + bugun);
        System.out.println("bugun.getDayOfMonth() = " + bugun.getDayOfMonth()); // 20 (raligin 20 si)
        System.out.println("bugun.getDayOfWeek() = " + bugun.getDayOfWeek()); // saturday
        System.out.println("bugun.getDayOfYear() = " + bugun.getDayOfYear()); // 354
        System.out.println("bugun.getMonthValue() = " + bugun.getMonthValue()); // 12. ay
        System.out.println("bugun.getMonth() = " + bugun.getMonth()); // DECEMBER

        System.out.println("       **********         ");

        LocalDate falanTarih = LocalDate.of(1976,11,3);
        // Tanimlanan tarih sonrasi icin --> plus()
        // Tanimlanan tarih oncesi icin --> minus() meth kullanilir.

        System.out.println("Plus and Minus date usage " + falanTarih.plusYears(3).minusMonths(2).plusDays(23)); // 1079-09-26


    }
}
