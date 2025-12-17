package j15_DateTime;

import java.time.LocalDate;

public class C07_ComparingDateTime {
    public static void main(String[] args) {


  /*     ComperaTo komutu işlevi:
        2020-05-23 >  2018-04-02   compareTo =>  2  en büyük fark yılda olduğu için
        2020-05-23 >  2020-04-02   compareTo =>  1  en büyük fark ayda  olduğu için
        2020-05-23 >  2020-05-02   compareTo =>  21  en büyük fark günde olduğu için    */

        LocalDate bugun = LocalDate.now();
        LocalDate falanGun =bugun.plusDays(33);
        LocalDate fistanGun = bugun.minusDays(66);
        LocalDate imren = LocalDate.of(1991,1,14);

        System.out.println("bugun = " + bugun); // 2025-12-17
        System.out.println("falanGun = " + falanGun); //2026-01-19
        System.out.println("fistanGun = " + fistanGun); //2025-10-12
        System.out.println("imren = " + imren); // 1991-01-14

        System.out.println("falanGun.isLeapYear() = " + falanGun.isLeapYear()); //false
        System.out.println("falanGun.isAfter(imren) = " + falanGun.isAfter(imren)); //true

        System.out.println(" *******************");

        System.out.println("bugun.compareTo(imren) = " + bugun.compareTo(imren)); // 34 year
        System.out.println("falanGun.compareTo(fistanGun) = " + falanGun.compareTo(fistanGun)); // 1
        System.out.println("imren.compareTo(falanGun) = " + imren.compareTo(falanGun)); // -35 1991-20262 yapti aslinda


    }
}
