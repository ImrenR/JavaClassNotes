package j05_ifStatementTernaryOperator.tasks;

import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {
		/* Task->
		 Girilen bir sayı için
		 sayi 3 basamakli ise console ' a "3 basamakli"
		 sayi 2 basamakli ise console'a "2 basamakli"
		 sayi 3 basamakli yada 2 basamakli degilse "ikisi de degil"  print eden code create ediniz
		 */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a= input.nextInt();

        if (a >= 100 && a<=999) {
            System.out.println("girilen sayi 3 basamaklidir");
        } else if (a >=10 && a<=99) {
            System.out.println("girilen sayi 2 basamaklidir.");
        }else System.out.println("ikisi de degil");

    }
}
