package j33_Lambda.lambdaTutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C06_Distinct {
    public static void main(String[] args) {
        List<String> yemahhh = new ArrayList<String>(Arrays.asList("küşleme", "küşleme", "küşleme", "soğanlı", "soğanlı", "soğanlı", "trileçe", "bicibici", "büryan", "melemen", "cacix", "kokereç", "yağlama", "güveç", "arabAşı", "tantuni"));
        // List<String> yemahhh = new ArrayList<>(Arrays.asList("bicibici", "güllaç", "sütlaç", "künefix", "bicibici", "güllaç", "güllaç"));

        System.out.println("   *** task01 ***   ");
printBuyukHarfYazdir(yemahhh);
         System.out.println("\n   *** task02 ***   ");
printChSayisiniTersSirala(yemahhh);
         System.out.println("\n   *** task03 ***   ");
        printChSayisiniKB(yemahhh);
         System.out.println("\n   *** task04 ***   ");
        printSonChGoreTerSirala(yemahhh);
         System.out.println("\n   *** task05 ***   ");
        printCiftSKareAlBkSirala(yemahhh);
     }//main sonu




    //Task01-> list elemanlarını alfabetik Buyuk harf ile tekrarsız print eden code create ediniz...

    ///  Distinct benzersiz yapar, duplicate onune gecer,

    private static void printBuyukHarfYazdir(List<String> yemahhh) {
        yemahhh
                .stream()
                .map(String::toUpperCase)
                .distinct()
                .forEach(SeedMethods::strYazdir); // KÜŞLEME SOĞANLI TRILEÇE BICIBICI BÜRYAN MELEMEN CACIX KOKEREÇ YAĞLAMA GÜVEÇ ARABAŞI TANTUNI

    }



    // Task02-> : list elemanlarinin character sayisini, (length) ters sirali  olarak(sorted reverseOrder) tekrarsiz(distinct) print eden code create ediniz.

    private static void printChSayisiniTersSirala(List<String> yemahhh) {

            yemahhh
                    .stream()
                    .map(String::length) // kac karakter oldugunu length ile string ten getiririm
                    .sorted(Comparator.reverseOrder())
                    .distinct()
                    .forEach(SeedMethods::intYazdir); // KÜŞLEME SOĞANLI TRILEÇE BICIBICI BÜRYAN MELEMEN CACIX KOKEREÇ YAĞLAMA GÜVEÇ ARABAŞI TANTUNI
     ///   8 7 6 5
    }



    // Task03-> : list elemanlarinin character sayisini  k->b sıralı benzersiz print eden code create ediniz.

    private static void printChSayisiniKB(List<String> yemahhh) {

        yemahhh
                .stream()
                .map(String::length) // kac karakter oldugunu length ile string ten getiririm
                .sorted()
                .distinct()
                .forEach(SeedMethods::intYazdir); // KÜŞLEME SOĞANLI TRILEÇE BICIBICI BÜRYAN MELEMEN CACIX KOKEREÇ YAĞLAMA GÜVEÇ ARABAŞI TANTUNI
        ///   8 7 6 5
    }


    // Task04-> : list elemanlarini son characterine göre ters sıralı tekrarsız print eden code create ediniz.

    private static void printSonChGoreTerSirala(List<String> yemahhh) {

        yemahhh
                .stream()
                .sorted(Comparator.comparing(t-> t.toString().charAt(t.toString().length() - 1)).reversed())
                .distinct()
                .forEach(SeedMethods::strYazdir);
      ///soğanlı arabAşı kokereç güveç cacix büryan melemen bicibici tantuni küşleme trileçe yağlama
    }
/*
                 sorted(Comparator.comparing(str -> str.charAt(str.length() - 1), Comparator.reverseOrder())
                sorted((s1, s2) -> Character.compare(s2.charAt(s2.length() - 1), s1.charAt(s1.length() - 1)))
             */

    // Task05-> listin elemanlarin  cift sayili karakterlerinin  karelerini   b->k sirali tekrarsiz print eden code create ediniz...

    private static void printCiftSKareAlBkSirala(List<String> yemahhh) {

        yemahhh
                .stream()
                .map(t->t.length()*t.length())
                .filter(SeedMethods::ciftMi)
                .sorted(Comparator.reverseOrder())
                .distinct()
                .forEach(SeedMethods::intYazdir);
        ///64 36
    }



}
