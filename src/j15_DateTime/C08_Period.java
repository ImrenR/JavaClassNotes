package j15_DateTime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class C08_Period {
    public static void main(String[] args) {
        // period-> iki tarih arasındaki geçen tekrarlana datayı tutar...




         LocalDate bugun =LocalDate.now(); // bugunu aldik
        LocalDate imren = LocalDate.of(1991,1,14);

        Period p1 =Period.between(bugun,imren); // bugun ile imren arasina bir period olusturdum
        System.out.println("p1 = " + p1); // P-34Y-11M-6D

        System.out.println("p1.getDays() = " + p1.getDays()); // -6 (bugun 20 imrenin gunu 14-> 14-20= -6)
        System.out.println("p1.getMonths() = " + p1.getMonths());  // -11 (12. ay imren 1. ay => 1-12= -11)
        System.out.println("p1.getYears() = " + p1.getYears()); // -34


        System.out.println("   *****    ");

        Period p2 = Period.ofDays(6); // her 6 gunde bir meeting olacak gibi
        bugun.plus(p2); // yukarda days verdigimzi icin plusDays demeye gerek yok p2 zaten gundur

        System.out.println("bugun.plus(p2) = " + bugun.plus(p2)); // 2025-12-26 bir sonraki daily tarihi gibi mesela

// Task-> 18 eylul 2023 başlayan java kursu 11 aylık planlanırsa bitiş tarihini gun sayısını print eden code create ediniz.

        LocalDate kursStart = LocalDate.of(2023,9,18);
        Period kursSuresi=Period.ofMonths(11);
        System.out.println("kursStart = " + kursStart); // 2023-09-18
        System.out.println("kursBitis" + kursStart.plus(kursSuresi).format(DateTimeFormatter.ISO_LOCAL_DATE));
        // 2024-08-18


        // ISO -> International Organization for Standardization











    }
}
