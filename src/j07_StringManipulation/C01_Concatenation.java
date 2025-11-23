package j07_StringManipulation;

public class C01_Concatenation {

    public static void main(String[] args) {
        /*
        concat() -> methodu içinde parametre aldığı String variable'ı çaloştığı string sonuna ekler(birleştirir)
        Java '+' işleminde en az bir string ifade varsa artimetik toplama değil birleştirme yapılır.
         */

        String a = "Hello";
        String b = "World";

        String c =a.concat(b);
        System.out.println(c);// HelloWorld
 /*
 Ahan da TRICK-> String meth vcariable'da kalıcı değil geçici değişklik yapar.
 String variabvle kalıcı değişklik yapmak için atama(=) yapılmalı
  */


        String x= "Java";
        x.concat("Guzelsin");
        System.out.println(x);


        /*
        Trick->concat meth. parametre olarak String harici tum dataları Stringe cevirip concat(birleştirir)
        String murekkep gibi sonrasındaki tum variable'rı String olarak concat(birleştirir)
         */
String s = "Sayi: ";
s = s.concat(5 + "");
        System.out.println(s);


        System.out.println( 5 + 3 + "Java"); //8 Java  Once toplama islemi yapar
        System.out.println("Java" + 5 + 3); // Java 53 String basladi sonrasi hep string

        "Java".concat(5+3+ ""); // sonradaki string olmasaydi calismazdi cunku concat int almaz.

        System.out.println("Sonuc: " + 4 + 6); // sonuc : 46
        System.out.println("Sonuc:" + (4+6)); // sonuc : 10


        String z = "Javacim";
        z = z.concat("Guzelsin kiz");
        System.out.println(z); // z yi "=" ile atadik ve z artik concat ile update edildi yoksa string ler immutable dir degistriilemez
    }
}
