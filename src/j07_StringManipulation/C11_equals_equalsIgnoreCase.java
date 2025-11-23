package j07_StringManipulation;

import java.awt.*;

public class C11_equals_equalsIgnoreCase {

    public static void main(String[] args) {
        /* equals()
         * 2 String metnin birbirine esit olup olmadigina bakar. büyük küçük harf farkı vardır. Sonuc boolean dir.
         *
         *  equals() method’u verilen iki String’in içeriğinin birbirine eşit olup olmadığını kontrol eder.
         * == karşılaştırma operatörü ise verilen iki String objesinin değerinin yanında reference(adres)’lerine de bakar.
         * Aynı değere sahip olsa da farklı iki objeyi == ile karşılaştırdığımızda sonuç FALSE olur.

         * equalsIgnorecase()
         * equals() ile ayni islevi gorur, tek farki buyuk kucuk harfe duyarliligi yoktur. Sonuc boolean dir.
         */



 /*
 String s1 = “text”; kullanımı, eğer varsa, string sabit havuzunda (string constant pool) bir örneği yeniden kullanır.
 Yoksa havuz içerisinde yeniden alan oluşturur. Bu durum Java’ya özgü Java Sanal Makinesi (JVM) tarafından gerçekleştirilen bir durumdur.

 s1 ve s2 String constant pool içerisinde aynı referans değere (reference) sahiptir. s3 ve s4 ise farklı nesneleri ifade eder.
 s1 == s2 , s1 ve s2 ‘nin hafızadaki adres değerlerini karşılaştırır ve  String constant pool üzerinde aynı adresi gösterirler.
 Böylece ekrana TRUE yazdırır.
 s1.equals(s2) ifadesi ise, nesneler içerisindeki değerleri (clarusway) karşılaştırdığı için ekrana TRUE yazdırır.
 Bildiğimiz gibi == operatörü hafızadaki adresleri karşılaştırır, s3 ve s4 birbirinden farklı nesneler oldukları
 için farklı adreslerde tutulurlar.  Bu yüzden s3 == s4 ifadesi ekrana FALSE yazdırır.
 s3.equals(s4) ifadesi ise, nesneler içerisindeki değerleri (clarusway) karşılaştırdığı için ekrana TRUE yazdırır.
         */

    }
}
