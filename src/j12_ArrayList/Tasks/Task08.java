package j12_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        // Task-> Girilen sayıların içinde ortalamadan buyuk olanları
        // print eden METHOD create ediniz.

Scanner input = new Scanner(System.in);

        System.out.println("Kac adet sayi girmek istediginizi belirtiniz : ");
        int sayi= input.nextInt();
        List<Integer> liste= new ArrayList<>();
        int i =1;

        while(i<=sayi) {
            System.out.println(i + ". sayiyi giriniz: ");
            liste.add(input.nextInt());
            i++;
        }

        double ort = ortalamayiBul(liste);
        System.out.println("ort = " + ort);

       List<Integer> result= ortdanYuksekSayilar(liste,ort);
        System.out.println("result = " + result);
    }

    private static List<Integer> ortdanYuksekSayilar(List<Integer> liste, double ort) {
   List<Integer> sonuc = new ArrayList<>();
   for(int avuc:liste){
       if(ort<avuc) {
           sonuc.add(avuc);
       }
   }
   return sonuc;
    }


    private static double ortalamayiBul(List<Integer> liste) {
        int toplam = 0;
        for(int avuc: liste) {
            toplam+=avuc;
        }
        return toplam/ liste.size();
    }


}
