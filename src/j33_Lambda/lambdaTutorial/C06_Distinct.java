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
         System.out.println("\n   *** task02 ***   ");
         System.out.println("\n   *** task03 ***   ");
         System.out.println("\n   *** task04 ***   ");
         System.out.println("\n   *** task05 ***   ");
     }//main sonu

    //Task01-> list elemanlarını alfabetik Buyuk harf ile tekrarsız print eden code create ediniz...


    // Task02-> : list elemanlarinin character sayisini ters sirali olarak tekrarsiz print eden code create ediniz.

    // Task03-> : list elemanlarinin character sayisini  k->b sıralı benzersiz print eden code create ediniz.



    // Task04-> : list elemanlarini son characterine göre ters sıralı tekrarsız print eden code create ediniz.


/*
sorted(Comparator.comparing(str -> str.charAt(str.length() - 1), Comparator.reverseOrder())
sorted((s1, s2) -> Character.compare(s2.charAt(s2.length() - 1), s1.charAt(s1.length() - 1)))
 */


    // Task05-> listin elemanlarin  cift sayili karakterlerinin  karelerini   b->k sirali tekrarsiz print eden code create ediniz...

}
