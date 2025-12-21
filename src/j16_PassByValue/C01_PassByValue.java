package j16_PassByValue;

import java.time.Period;

public class C01_PassByValue {
    public static void main(String[] args) {
                   /*
        Java Pass By Value bir programlama dilidir.

Bir  primitive  variable  argument olarak bir methoda call edildiğinde variable değil bir copy clone(vesikalık)(pointer)değeri gönderilir.

         */
        // task -> verilen fiyat için %24 artırılmış fiyatı print eden METHOD  create ediniz.

        double fiyat = 100; // double data type primitive variable create edildi
        System.out.println("Method call oncesi = " + fiyat); // 100.0
        System.out.println("fiyatArttir = " + fiyatArttir(fiyat)); // 124.00
        System.out.println("Method call sonrasi = " + fiyat); // 100.0
    }// main sonu

    private static double fiyatArttir(double a) {
        return a*1.24;
    }


}//Class sonu
