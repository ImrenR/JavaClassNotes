package j15_DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class C03_LocalDateTime {
    public static void main(String[] args) {
        // LocalDateTime -> yıl-ay-gun-saat-dakika-saniye datalarını tutar


        // Local Date time variable atama yapılmazsa değişmediği için immutable 'dır

LocalDateTime ldt1 = LocalDateTime.now();
        System.out.println("ldt1 = " + ldt1);
        System.out.println("ldt1.getHour() = " + ldt1.getHour());
        System.out.println("ldt1.getDayOfYear() = " + ldt1.getDayOfYear());

    }
}
