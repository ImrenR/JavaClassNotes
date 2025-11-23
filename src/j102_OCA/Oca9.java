package j102_OCA;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Oca9 {
    public static void main(String[] args) {
        LocalDateTime dt=LocalDateTime.of(2014,11,7,11,11);
        System.out.println(dt);
        dt.plusDays(30);
        System.out.println();
        System.out.println(dt);
        dt.plusMonths(1);
        System.out.println(dt);
        System.out.println(dt.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

    }
}
