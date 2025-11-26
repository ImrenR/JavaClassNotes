package j08_Loops.Loop01_FoorLopp.Tasks;

import java.util.Scanner;

public class Task04 {

    public static void main(String[] args) {
        // task-> girilen iki tamsayı arasındaki çift sayıları print eden code create ediniz...

        Scanner input = new Scanner(System.in);
        System.out.println("Bir tamsayi giriniz: ");
        int sayi = input.nextInt();
        int sayi1 = input.nextInt();

        for (int i = sayi; i <sayi1 ; i++) {
            if (i % 2 == 0) {
                System.out.println("Cift sayilar : " + i);
            }
        }
        }
        }



