package j15_DateTime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class C08_Period {
    public static void main(String[] args) {
        // period-> iki tarih arasındaki geçen tekrarlana datayı tutar...

        // Task-> 18 eylul 2023 başlayan java kursu 11 aylık planlanırsa
        // bitiş tarihini gun sayısını print eden code create ediniz.

        LocalDate bugun = LocalDate.now();
        LocalDate imren = LocalDate.of(1991,1,14);
        Period p1 = Period.between(bugun,imren);
        System.out.println("p1 = " + p1); // P-34Y-11M-3D

        System.out.println("p1.getDays() = " + p1.getDays()); // -3
        System.out.println("p1.getMonths() = " + p1.getMonths()); // -11
        System.out.println("p1.getDays() = " + p1.getDays()); // -3

        System.out.println("   *******************  " );

        Period p2 = Period.ofDays(6); // 6 gunde 1 tekrarlanacak bir action gibi
        System.out.println("bugun.plus(p2) = " + bugun.plus(p2)); // bugunden itibaren 6 gunde 1 tekrarlanacak action
         // bir sonraki meeting 23 unde olacak gibi cunku bugun 17 si

        // ISO -> International Organization for Standardization



    }
}
