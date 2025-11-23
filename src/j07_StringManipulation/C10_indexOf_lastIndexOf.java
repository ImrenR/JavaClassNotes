package j07_StringManipulation;

import java.util.Scanner;

public class C10_indexOf_lastIndexOf {
    public static void main(String[] args) {
               /* indexOf()-> aranan yolcunun koltuk numarasını verir.
          char karakter ya da String metnin kacinci indexden basladigini veren bir method dur. Sonuc integer dir.
          Bu method index'i sorulan char'in String icindeki ilk gorunumunun index'ini return eder
          contains den farkı indexini verir, contains ise true false
          donus tipi : int tir.
          Eger karakter string varsa ilk buldugu index i doner.
          Eger yoksa -1 doner CTE veya RTE vermez.
          Contains() gibi true false yerine index numarasi verir.
        */

String str = " Java is fun";
        System.out.println(str.indexOf("a"));
        System.out.println(str.indexOf("is"));
        System.out.println(str.indexOf("Python"));

        // ahan da trick-> indexOf("Java"); olmayan char veya String için CTE veya RTE değil -1 return eder

          /* lastIndexOf()
         String içinde aranan karakter(ler)in sondan itibaren ilk indexini verır
         indexOf un sondan olan hali fakat index numaraları değişmez.
         lastIndexOf() Method'u index'i sorulan character'in son gorunumunun index'ini return eder.
         indexOf() methodunda birden fazla character'in index'i sorulursa ilk character'in index'i return edilir.
         */



         /* Task-> girilen bir string ifadenin aşağıdaki şartları sağlamasını kontrol eden code create ediniz
        a-) girilen ifade java içermiyor
        b-) girilen ifade 1 adet java içeriyor
        c-) girilen ifade  1'den çok java içeriyor
         */




    }
}
