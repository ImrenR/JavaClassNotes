package j33_Lambda.lambdaTutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C05_Sorted {

    public static void main(String[] args) {
        List<Integer> sayiList = new ArrayList<>(Arrays.asList(7, 58, 17, 54, 33, 3, 13, 35, 65, 18, 61, 46, 25, 16, 6));
        //  List<Integer> sayiList = new ArrayList<>(Arrays.asList(7, 58, 17, 35, 34, 25, 16, 6));

        System.out.println("   *** task01 ***   ");
        printCiftKareKbSira(sayiList); // // 36 256 324 2116 2916 3364
         System.out.println("\n   *** task02 ***   ");
        printTekKareBkSira(sayiList);

/*
sorted() -> akışdaki elemanları naturel order (doğal sıra) halinde akış return eder
sorted() tekrarlı kullanılırsa son return aktif olur...
 */

    }//main sonu



    // Task01-> list çift elemanlarının(filter yaparim) karelerini(map) k->b sıra(sorted) ile print eden(foreach) code create ediniz
    private static void printCiftKareKbSira(List<Integer> sayiList) {
        sayiList.stream()
                .filter(SeedMethods::ciftMi)
                .map(SeedMethods::kareAl)
                .sorted()
                .forEach(SeedMethods::intYazdir); // 36 256 324 2116 2916 3364


    }


    // Task02-> list tek elemanlarının karelerini b->k sıra ile print eden code create ediniz
    private static void printTekKareBkSira(List<Integer> sayiList) {
        sayiList.stream()
                .filter(SeedMethods::tekMi)
                .map(SeedMethods::kareAl)
                .sorted(Comparator.reverseOrder()) // tersten sirala yani Buyukten kucuge dogru
                .forEach(SeedMethods::intYazdir); // 4225 3721 1225 1089 625 289 169 49 9


    }



}//Class
