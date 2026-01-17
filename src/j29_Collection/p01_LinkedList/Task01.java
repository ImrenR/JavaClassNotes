package j29_Collection.p01_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
     /*
        Task->
        Node değerleri "Murat","javaCAN","javaTAR","Musa bey" olan bir linkedList create ediniz.
        Girilen bir String değeri linkedListte varlığını kontrol edip varsa silip "Agam eleman halledildi"
        yoksa "Agam aradığınız kişiye ulaşılamadı" print eden code create ediniz.

         */
        LinkedList<String > strList = new LinkedList<>(Arrays.asList("Murat","javaCAN","javaTAR","Musa bey"));

        Scanner sc = new Scanner(System.in);
        System.out.print("Bir isim giriniz: ");
        String aranan = sc.nextLine();

        if (strList.contains(aranan)) {
            strList.remove(aranan);
            System.out.println("Agam eleman halledildi");
        } else {
            System.out.println("Agam aradığınız kişiye ulaşılamadı");
        }

        System.out.println(strList);
    }
}
