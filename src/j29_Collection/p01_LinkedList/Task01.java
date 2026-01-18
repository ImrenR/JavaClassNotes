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
       LinkedList<String> liste=new LinkedList<>(Arrays.asList("Murat","javaCAN","javaTAR","Musa beycigim"));

       Scanner input= new Scanner(System.in);
        System.out.println("Bir string degeri giriniz :");
        String a=input.nextLine();

          if(liste.remove(a)){
              System.out.println("Agam eleman halledildi");
          }else System.out.println("Aradiginiz kisiye su anda ulasilamiyor");


    }
}
