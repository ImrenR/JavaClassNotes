package j07_StringManipulation;

public class C12_replace_replaceAll {
    public static void main(String[] args) {
        /** replace()
         * Metin icerisindeki karakter ya da bir parcasinin, istenilen karakter
         * ya da metinle degistirilmesini
         * (update -set) saglar. Sonuc String'dir..
         * char ve String ile calisir, regex kabul etmez
         */
String str = "Java guzeldir! 123";
//1) Karakter degistirme
        System.out.println(str.replace('a','A')); // degistirdi
// 2) Kelime degistirme
        System.out.println(str.replace("guzeldir", "harikadir"));
 // 3) Birden fazla karakteri ayni anda degistirme
        System.out.println(str.replace("!",":)"));
// 4) replace() regex kabul etmez
        System.out.println(str.replace("//d","*"));
        // calismaz





        // replaceAll() method u replace() methoduna benzer ama 2 fark vardır
        //1-replace() methodu char kabul eder ama replaceAll kabul etmez
        //2-replaceAll() method u regex kullanımına izin verir (Regular Expressions)
        //(Regular Expressions)
        //   \\s bosluk
        //   \\S bosluk disindaki tum karakterler
        //   \\w harfler ve rakamlar (a z A Z, 0 9)
        //   \\W harfler ve rakamlar disindaki tum karakterler
        //   \\d rakamlar 0 9
         //   \\D rakamlar disindaki tum karakterler

//1) Tum bosluklari sil :

        System.out.println(str.replaceAll("\\s",""));
// 2) Bosluk disinda tum karakterleri sil :
        System.out.println(str.replaceAll("\\S","*"));
// 3) Sadece harf ve rakamlari birak (\\W olanlari sil)
        System.out.println(str.replaceAll("\\W", ""));
// 4) Sadece rakamlari sil (\\d -> , \\D -> rakam olmayan)
        System.out.println(str.replaceAll("\\d", "*"));
// 5) Rakam disindakileri sil -> sadece sayilari birakir
        System.out.println(str.replaceAll("\\D", ""));



    }
}
