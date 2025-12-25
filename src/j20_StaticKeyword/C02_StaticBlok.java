package j20_StaticKeyword;

public class C02_StaticBlok {//class level
     /*
       1.static blok yapıları static variable'rı değer ataması update için kullanılır
       2.static blok Class oluşturulduğunda butun method'lardan(main method dahil) önce çalışır
       3.birden fazla static blok varsa yukarıdan aşagiya sıralama ile çalışır.
       4.static bloklar sadece 1 kere en basta calisir static olmayan bloklar her obje olusturulurken yeniden calisir
        */

    static String isim="team lead  imren"; // static class variable

    static { // ilk run edilecek static block
        System.out.println("1.static block calisti");
        System.out.println("1.static block update oncesi isim = " + isim);
        isim ="developer imren";
        System.out.println("1. static Update sonrasi isim =" + isim);
    }

    static {
        System.out.println("2. static block calisti");
    }
    public static void main() { // main level
        System.out.println(" main method basladi");
        isim = "muhtesem haluk";
        System.out.println("method update spnrasi " + isim);
        System.out.println("main method bitti");

    } // main sonu
    static { // en son run edilecek static block
        System.out.println("3.static block calisti");
        System.out.println("3.static block update oncesi isim = " + isim);
        isim ="fs developer imren";
        System.out.println("3. static Update sonrasi isim =" + isim);
    }
}//Class sonu
