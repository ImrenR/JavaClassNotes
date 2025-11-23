package j33_Lambda.lambdaTutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C07_Match {

    public static void main(String[] args) {
        //anyMatch() --> enaz bir eleman sarti saglarsa true aksi durumda false return eder
        //allMatch() --> tum  elemanlar sarti saglarsa true en az bir eleman sarti saglamazsa false return eder.
        //noneMatch()--> hic bir eleman sarti SAGLAMAZSA true en az bir eleman sarti SAGLARSA false return eder.

        List<String> yemahhh = new ArrayList<>(Arrays.asList("küşleme", "soğanlı", "trileçe", "bicibici", "büryan", "Welemen", "cacix", "kokereç", "yağlama", "güveç", "arabAşı", "tantuni"));

        System.out.println("\n   Task01   ");

        System.out.println("\n   task02   ");
         System.out.println("\n   task03   ");
     }//main sonu

    // Task01->  List elemanlarinin karakter sayisini 7 ve 7 'den az olma durumunu kontrol eden code create ediniz.



    // Task02-> List elemanlarinin "W" ile baslamamasını kontrol eden code create ediniz...->noneMatch

    // Task03-> List elemanlarinin "x" ile biten en az bir elemanın varlığını kontrol ediniz eden code create ediniz...->

}
