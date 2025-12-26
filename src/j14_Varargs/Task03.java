package j14_Varargs;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
         /*
        Task ->  girilen bir sayı ile girilen String'lerin en uzun harf sayısını çarpıp print eden METHOD create ediniz.
         */


        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz :");
        int sayi = input.nextInt();
        System.out.println("Bir kelime griniz");



     int sonuc = enUzunHarfCarp(sayi,
              input.nextLine(),
              input.nextLine(),
               input.nextLine()
       );

        System.out.println("sonuc = " + sonuc);

    }

    public static int enUzunHarfCarp(int sayi,String...x){

        int maxUzunluk =0;

       for(String s:x){
           if(s.length()> maxUzunluk){
               maxUzunluk =s.length();
           }
       }
        return sayi*maxUzunluk;
    }
}
