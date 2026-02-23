package j33_Lambda.lambdaTutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class C08_Limit {


    public static void main(String[] args) {

        List<String> yemahhh = new ArrayList<>(Arrays.asList("küşleme", "soğanlı", "trileçe", "bicibici", "büryan", "Welemen", "cacix", "kokereç", "yağlama", "güveç", "arabAşı", "tantuni"));
        //  List<String> yemahhh = new ArrayList<>(Arrays.asList("soğanlııı", "Wöveççççç"));
        //limit(a) akısdan cıkan elemanları a parametresine gore ilk a elamanı alır.

        System.out.println("\n   Task   ");


    }//main sonu


    // Task-> list elemanlarının karakter sayısı en buyuk olanı print code create ediniz...

public static void printMaxCharsay(List<String> yemahhh){

        System.out.println(" ********* version1 **********");

    System.out.println(
            yemahhh
                    .stream().
                    sorted(Comparator.comparing(String::length).reversed())
            .limit(1));



    System.out.println(" ********* version2 **********");
   Stream<String> maxCarhsay = yemahhh
           .stream()
                   .sorted(Comparator.comparing(String::length).reversed())
                           .limit(1); // En buyuk uzunluktaki elemani ver

    System.out.println(" ********* version3 **********");

    Stream<String> maxCarhsay3 = yemahhh
            .stream()
            .sorted(Comparator.comparing(String::length).reversed())
            .limit(1);

    System.out.println(Arrays.toString(maxCarhsay3.toArray()));

    System.out.println(" ********* version4 **********");

    System.out.println(yemahhh
            .stream()
            .sorted(Comparator.comparing(String::length).reversed())
            .findFirst());


    System.out.println(" ********* version5 **********");
    yemahhh
            .stream()
            .sorted(Comparator.comparing(String::length).reversed())
            .limit(1)
                    .forEach(SeedMethods::strYazdir);

    System.out.println(" ********* version6 **********");
    System.out.println(yemahhh
            .stream()
            .sorted(Comparator.comparing(String::length).reversed())
            .limit(1)
            .collect(Collectors.toList()) // akistaki elemanlar listeye atandi
            .toString());


}
         /*
        limit(a)-> return typ bir Stream oldg için yani yeni bir eleman akışı oldg için birden çok eleman return edebilir.
        dolayısıyla limit() meth. çıktısı doğrudan sout parametre olamaz(print edilemez) .
        limit() meth cıktısı array veya List gibi bir collectiona atanmalı.
         */


}
