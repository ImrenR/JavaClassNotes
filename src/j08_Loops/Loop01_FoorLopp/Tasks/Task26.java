package j08_Loops.Loop01_FoorLopp.Tasks;

import java.util.Scanner;

public class Task26 {
    public static void main(String[] args) {
        //task -> verilen bir tam sayinin rakamlari toplamini print eden code create ediniz

         Scanner input = new Scanner(System.in);
         System.out.println("Bir tam sayi giriniz :");
         int sayi = input.nextInt();


         int toplam = 0;
         for (; sayi>0 ; ) { // we cant use fixer (i) here as we dont know in advance
              toplam += sayi % 10; // basamaklar
             sayi = sayi / 10;
        }
        System.out.println(toplam);
    }
}
