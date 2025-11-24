package j07_StringManipulation;

public class C13_ValueOf_parse {
    public static void main(String[] args) {



          /*
         Integer.valueOf() rakamlarla olusturulan String'leri sayiya donusturur.
         Boylece rakamlarla olusturulan Stringlerle matematiksel islemler yapabilmemizi saglar.

        valueOf(); meth hem Integer wrapper  hem de String Class'da bulunur.
         Integer wrapper Class valueOf() methdou String'i integer'a
         String Class valueOf() methodu integer'i String'e cevirir.
         */

        // task -> string type verilen iki adet bagıs miktarını toplayan code create ediniz..


String bagis1 = "$13.99";
String bagis2 = "$17.55";

// $ isaretini kaldir
        bagis1 = bagis1.replace("$", "");
        bagis2 = bagis2.replace("$", "");

// String -> Double ceviri :
        double d1 = Double.valueOf(bagis1);
        double d2 = Double.valueOf(bagis2);

        double toplam = d1 + d2;

        System.out.println("toplam bagis:" + toplam); // Cikti: Toplam bagis: 31.54


 /*
    Task-> String strA="$13.99"  String strB="$17.55" parse method kullanarak strA+strB toplamını print den code create ediniz
       output: strA+strB=31.54
         */
// Ornek 2 :

        String s1 = "$13.99";
        String s2 = "$17.55";

        s1 = s1.replace("$","");
        s2 = s2.replace("$","");

        double sayi1 = Double.parseDouble(s1);
        double sayi2 = Double.parseDouble(s2);

        System.out.println("Toplam : " + sayi1 + sayi2); // 31.54



// Ornek 3 :

        int sayi = 150;
        String str2 = String.valueOf(sayi);
        System.out.println(str2 + 50); //15050



        /*
Integer.valueOf() ile Integer.parseInt() metotları arasında temel fark
valueOf() metodu Integer tipinde bir obj, parseInt() metodu ise int tipinde bir veri tipi döndürür.
parseInt() metodu primitive veri tipi döndürdüğü için daha hızlı çalışır.
 */


        //Ornek 4 :

        String a = "25";
        String b = "35";

        int toplam = Integer.valueOf(a) + Integer.valueOf(b);
        System.out.println(toplam);
        // Toplam : 60
    }
}
