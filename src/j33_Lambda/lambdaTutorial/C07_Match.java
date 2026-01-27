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
printControlKArakter7az(yemahhh);
        System.out.println("\n   task02   ");
        System.out.println("printControlWileBaslamayan(yemahhh) = " + printControlWileBaslamayan(yemahhh));
        System.out.println("\n   task03   ");
        System.out.println("printControlXilebitenEnAzbirEl(yemahhh) = " + printControlXilebitenEnAzbirEl(yemahhh));
    }//main sonu


    // Task01->  List elemanlarinin karakter sayisini 7 ve 7 'den az olma durumunu kontrol eden code create ediniz.

    private static void printControlKArakter7az(List<String> yemahhh) {
       if (yemahhh
               .stream().anyMatch(t->t.length() <= 7)) {
           System.out.println("En az bir yemek yedi karakter icerir :-}");
       }else
           System.out.println("En az bir yemek yedi karakter icermez :( ");



    }

    // Task02-> List elemanlarinin "W" ile baslamamasını kontrol eden code create ediniz...->noneMatch

    private static String printControlWileBaslamayan(List<String> yemahhh) {
      return yemahhh
                .stream()
              .noneMatch(t->t.toString().substring(0,1).equalsIgnoreCase("W")) ?
          "W ile baslayan yemek yok :-}" :

           "W ile baslayan yemek var :) ";



    }



    // Task03-> List elemanlarinin "x" ile biten en az bir elemanın varlığını kontrol ediniz eden code create ediniz...->
    private static String printControlXilebitenEnAzbirEl(List<String> yemahhh) {
        return yemahhh
                .stream()
                .anyMatch(t->t.toString().endsWith("x")) ?
                "X ile biten yemek var :-}" :

                "X ile baslayan yemek yok :) ";



    }
}
