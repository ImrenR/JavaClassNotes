package j16_PassByValue;

import java.time.Period;

public class C01_PassByValue {
    public static void main(String[] args) {
                   /*
        Java Pass By Value bir programlama dilidir.

        Bir  primitive  variable  argument olarak bir methoda call edildiğinde variable

        değil bir copy clone (vesikalık) (pointer)değeri gönderilir.

         */
        // task -> verilen fiyat için %24 artırılmış fiyatı print eden METHOD  create ediniz.

        Period kurs = Period.ofMonths(11);
        double fiyat = 100; // double data type primiive variable create ettim.

        System.out.println("Meth oncesi fiyat = " + fiyat); // 100
        System.out.println("fiyatArttir(fiyat) = " + fiyatArttir(fiyat)); // 124
        System.out.println("Method sonrasi fiyat = " + fiyat); // 100

    }// main sonu

    private static double fiyatArttir(double a) {
        return a*1.24;


    }


}//Class sonu
