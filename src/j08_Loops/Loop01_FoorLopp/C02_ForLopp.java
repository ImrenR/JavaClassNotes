package j08_Loops.Loop01_FoorLopp;

import java.util.Scanner;

public class C02_ForLopp {
    public static void main(String[] args) {
        // Task-> girlen sayıdan 100'e kadar 4'un katı olan tamsayıları yan yana print eden code create ediniz
        Scanner input = new Scanner(System.in);

        System.out.println("Bir tam sayi giriniz: Hatta 100 den kucuk bir tamsayi giriniz");
        int sayi = input.nextInt();


        if(sayi < 100 ){
            for (int i = sayi; i < 100; i++) {
                if (i%4 == 0) {
                    System.out.print(i + " ");
                }
            }
        }else System.out.println("Hatali giris yaptiniz tekrar deneyin");
    }
}
