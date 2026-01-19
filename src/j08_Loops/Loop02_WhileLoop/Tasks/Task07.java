package j08_Loops.Loop02_WhileLoop.Tasks;

import java.util.Map;
import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {


        // Task-> girilen 5 sayının en buyugunu print eden code create ediniz


       Scanner input = new Scanner(System.in);

       int sayac=1;
       int enBuyuk=Integer.MIN_VALUE;

       while (sayac<=5){
           System.out.println(sayac + ". sayiyi giriniz :");
            int sayi=input.nextInt();

     if(sayi>enBuyuk){
         enBuyuk= sayi;
     }
     sayac++;
       }
        System.out.println("enBuyuk = " + enBuyuk);
    }
}
