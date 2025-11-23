package j07_StringManipulation;

public class C02_Length {

    public static void main(String[] args) {
        /*
        length() methodu girilen string'in uzunluğunu:içinde bulunan karakter sayısını return(döndurur :verir ) eder
        butun karakterleri(boşluk vs) sayıp adedini verir.
         */
String str = "Java Guzel";
        System.out.println(str.length());
        // 11 bosluk dahil hepsini yazar
        String s = "";
        System.out.println(s.length()); // Bu bir stringtir ama ici bos oldugu icin sonuc : 0 dir

        String sq = "   ";
        System.out.println(sq.length());
       /*
       Trick-> null atanan String variable her hangi bir meth call etmez .
       nul-> case sensitive NULL !=null !=Null
       null-> dutluk: arsa değeri olmayan arazisadece hiçiliği gösteren pointer(işaretçi)
        */

//String a = null;
       // System.out.println(a.length()); // HATA VERDI. cunku null bir string degildir herhangi bir objeye isaret etmez.






    }
}
