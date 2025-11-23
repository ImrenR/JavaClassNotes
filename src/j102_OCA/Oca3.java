package j102_OCA;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Oca3 {
    public static void main(String[] args) {
        LocalDateTime day=LocalDateTime.now();

        String date= LocalDate.parse("2023-05-15").format(DateTimeFormatter.ISO_DATE);
        System.out.println(date);
    }
}
