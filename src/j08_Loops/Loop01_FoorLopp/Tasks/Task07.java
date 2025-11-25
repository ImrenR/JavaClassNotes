package j08_Loops.Loop01_FoorLopp.Tasks;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        /*
        Task ->
        girilen boyuttta bir kare için
         Ekran Çıktısı
            Bir sayı giriniz: 7
            1 0 0 0 0 0 0
            0 1 0 0 0 0 0
            0 0 1 0 0 0 0
            0 0 0 1 0 0 0
            0 0 0 0 1 0 0
            0 0 0 0 0 1 0
            0 0 0 0 0 0 1


            Bir sayi giriniz: 5
            1 0 0 0 0
            0 1 0 0 0
            0 0 1 0 0
            0 0 0 1 0
            0 0 0 0 1

            şekli print eden code create ediniz
         */

        Scanner input = new Scanner(System.in);
        System.out.println("enter a number:");
        int num = input.nextInt();

        for (int i = 1; i <=num; i++) {
            for (int j = 1; j <=num ; j++) {
                if (i == j) {
                    System.out.print("1 ");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }


    }
}
