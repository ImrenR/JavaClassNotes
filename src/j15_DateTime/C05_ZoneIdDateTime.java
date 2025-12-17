package j15_DateTime;

import java.time.*;

public class C05_ZoneIdDateTime {
    public static void main(String[] args) {
        // herhangi bir ulke/sehir(local) tarih-zaman datasını tutar.

        LocalDate usaDate =LocalDate.now(ZoneId.of("America/Los_Angeles"));
        LocalTime usaTime = LocalTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println("usaTime = " + usaTime);
        System.out.println("usaDate = " + usaDate);


       // ZonedDateTime zdt1= ZonedDateTime.now(ZoneId.of("Aruba"));
        ZonedDateTime zdt2= ZonedDateTime.now(ZoneId.of("Japan"));
      //  ZonedDateTime zdt3= ZonedDateTime.now(ZoneId.of("America")); // RTE => unknown time-zone id : America
        ZonedDateTime zdt4= ZonedDateTime.now(ZoneId.of("CET"));
        System.out.println("zdt4 = " + zdt4); // 2025-12-17T17:48:20.650701+01:00[CET]
       // System.out.println("zdt1 = " + zdt1);
        System.out.println("zdt2 = " + zdt2); // 2025-12-18T01:48:20.650454+09:00[Japan]
     //   System.out.println("zdt3 = " + zdt3);

    }
}
