package j102_OCA.Q003;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q003 {
    public static void main(String[] args) {
        String date = LocalDate
                .parse("2014-05-04")        		// time is not assigned here
                .format(DateTimeFormatter.ISO_DATE_TIME);  	//_TIME should be removed
        System.out.println(date);
    }

}

///  Tarih parse etme LocalDate.parse ile olusturulur
///  format(DateTimeFormatter.ISO_DATE_Time) ifadesi LcalDate nesnesini ISO tarih date ofrmatinda yazdirmaya calistirir
///  Ancak LocalDate nesnesi zaman bilgisi icermez; yalnizca tarih bilgisi vardir
///  LocalDate nesnesi zaman bilgisi içermediği için, ISO_DATE_TIME formatı ile formatlanmaya çalışıldığında bir hata oluşur.
       ///  Cevap D dir

    /*  What is the result?
        A. May 04, 2014T00:00:00.000
        B. 2014-05-04T00:00: 00.000
        C. 5/4/14T00:00:00.000
        D. An exception is thrown at runtime.

D    */

///   LocalDateTime olmasi gerekiyordu