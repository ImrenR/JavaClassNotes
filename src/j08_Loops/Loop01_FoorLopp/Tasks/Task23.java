package j08_Loops.Loop01_FoorLopp.Tasks;

import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {

    /*  task-> girilen tam sayıya kadar olan sayıların karelerinin toplamını
         print eden code create ediniz.


        Girilen sayı=4
        Kareler toplamı=30
     */
        Scanner input = new Scanner(System.in);
        System.out.println("Bir tam sayi giriniz :");
        int sayi = input.nextInt();

        int toplam = 0;

        for (int i = 0; i <= sayi; i++) {
            toplam += (i * i);
        }
        System.out.println(toplam);
    }
}
