package j08_Loops.Loop02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task04 {

    public static void main(String[] args) {
		/*
		task->  3 basamakli 4 ve 6 ya tam bolunebilen tam sayilari buyukten kucuge ve kaç tane oldugunu print eden code create ediniz.

		 */
        int sayi=999;
        int sayac=0;

       while (sayi>=100) {
           if(sayi % 12 == 0){
               System.out.print( sayi + " ");
               sayac++;
           }
           sayi--; //kucuge dogru ilerle
       }
        System.out.println();
        System.out.println("sayac = " + sayac);

    }

}
