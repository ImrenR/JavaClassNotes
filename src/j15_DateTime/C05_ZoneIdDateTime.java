package j15_DateTime;

import java.time.*;

public class C05_ZoneIdDateTime {
    public static void main(String[] args) {
        // herhangi bir ulke/sehir(local) tarih-zaman datasını tutar.

       LocalDate usaDate= LocalDate.now(ZoneId.of("America/Los_Angeles"));
        LocalTime usaTime= LocalTime.now(ZoneId.of("America/Los_Angeles"));
        LocalDate japanDate= LocalDate.now(ZoneId.of("Japan"));

        System.out.println("usaDate = " + usaDate); //  2025-12-20
        System.out.println("usaTime = " + usaTime);  //  1v3:19:44.961210
        System.out.println("japanDate = " + japanDate); // 2025-12-21

       // ZonedDateTime zdt2 =ZonedDateTime.now(ZoneId.of("Japan")); // RTE-> Unknown time-zone
       // ZonedDateTime zdt3 = ZonedDateTime.now(ZoneId.of("America")); //-> RTE
        ZonedDateTime zdt4 = ZonedDateTime.now(ZoneId.of("CET")); //zdt4 = 2025-12-20T22:34:16.601619+01:00[CET]
     //   System.out.println("zdt2 = " + zdt2);
      //  System.out.println("zdt3 = " + zdt3);
        System.out.println("zdt4 = " + zdt4);
    }
}
