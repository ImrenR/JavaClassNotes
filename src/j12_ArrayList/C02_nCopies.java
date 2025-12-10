package j12_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class C02_nCopies {
    public static void main(String[] args) {


ArrayList<String> ulkeList =new ArrayList<>(Arrays.asList("almanya" , "Cuba", "Ingiltere"));
ArrayList<String> isimList =new ArrayList<>(Arrays.asList("imren" , "elvan", "haluk"));

        //nCopies(int n, Obj)-> n elemanlı sabit obj'den oluşan list tanımlar
ArrayList<String>yeniList = new ArrayList<>(Collections.nCopies(7, "JavaCan")); // 7 JavaCan elemanli list tanimlandi.
        System.out.println(yeniList);


        //addAll(list);-> girilen liste istene liste ekler..

ulkeList.addAll(isimList); //ulkeList isimListe tamamen eklendi.
        System.out.println("ulkeList = " + ulkeList);

        isimList.addAll(3, yeniList);
        System.out.println("isimList = " + isimList); //isimList 3. index ten itibaren yeniListe eklendi.

    }
}
