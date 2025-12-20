package j15_DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class C03_LocalDateTime {
    public static void main(String[] args) {
        // LocalDateTime -> yıl-ay-gun-saat-dakika-saniye datalarını tutar


        // Local Date time variable atama yapılmazsa değişmediği için immutable 'dır

LocalDateTime ldt1 = LocalDateTime.now();

        System.out.println("ldt1 = " + ldt1); // 2025-12-20T17:40:24.939274
        System.out.println("ldt1.getHour() = " + ldt1.getHour()); // 17
        System.out.println("ldt1.getDayOfYear() = " + ldt1.getDayOfYear()); // 354
        System.out.println("ldt1.getDayOfMonth() = " + ldt1.getDayOfMonth()); // 20
        System.out.println("ldt1.getDayOfWeek() = " + ldt1.getDayOfWeek()); // SATURDAY
        System.out.println("ldt1.getMinute() = " + ldt1.getMinute()); // 42

        LocalDateTime ldt2 = LocalDateTime.of(2020, Month.FEBRUARY,28,23,45,54);
        System.out.println("ldt2 = " + ldt2); // 2020-02-28T23:45:54
        System.out.println("Sonuc = " + ldt2.plusDays(34).minusHours(21).plusWeeks(45).plusYears(1)); // 2022-02-11T02:45:54
        System.out.println("ldt2 = " + ldt2); // 2020-02-28T23:45:54
        // ldt2 icin -> LocalDateTime variable atama yapilmazsa degismez,, immutable clastir.
        // = yapmaidigmiz icin ayni sekilde devam eder


    }
}
