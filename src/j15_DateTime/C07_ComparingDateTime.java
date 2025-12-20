package j15_DateTime;

import java.time.LocalDate;

public class C07_ComparingDateTime {
    public static void main(String[] args) {


  /*     ComperaTo komutu işlevi:
        2020-05-23 >  2018-04-02   compareTo =>  2  en büyük fark yılda olduğu için
        2020-05-23 >  2020-04-02   compareTo =>  1  en büyük fark ayda  olduğu için
        2020-05-23 >  2020-05-02   compareTo =>  21  en büyük fark günde olduğu için    */


     LocalDate bugun = LocalDate.now();
     LocalDate alanGun =bugun.plusDays(33);
     LocalDate fesmekanGun = bugun.minusDays(66);
     LocalDate imren = LocalDate.of(1991,1,14);

        System.out.println("bugun = " + bugun); // bugun = 2025-12-20
        System.out.println("alanGun = " + alanGun); // alanGun = 2026-01-22
        System.out.println("fesmekanGun = " + fesmekanGun); // fesmekanGun = 2025-10-15
        System.out.println("imren = " + imren); // imren = 1991-01-14

        System.out.println("alanGun.isLeapYear() = " + alanGun.isLeapYear()); // false
        System.out.println("alanGun.isAfter(imren) = " + alanGun.isAfter(imren)); // true
        System.out.println("imren.isBefore(fesmekanGun) = " + imren.isBefore(fesmekanGun)); //true

        System.out.println(" ****************   ");

        System.out.println("bugun.compareTo(imren) = " + bugun.compareTo(imren)); // 34
        System.out.println("alanGun.compareTo(fesmekanGun) = " + alanGun.compareTo(fesmekanGun)); // 1
        System.out.println("imren.compareTo(alanGun) = " + imren.compareTo(alanGun)); // -35

        System.out.println("***********");

    }
}
