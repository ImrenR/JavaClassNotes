package j08_Loops.Loop01_FoorLopp.Tasks;

import java.sql.SQLOutput;
import java.util.Scanner;



public class Task01 {
    public static void main(String[] args) {
    /*
       Interview Question

               Girilen  100’den kucuk bir tamsayi için
               1’den baslayarak girilen sayiya kadar tum sayilari
       		- Sayi 3’un kati ise sayi yerine “Java”
       		- Sayi 5’in kati ise sayi yerine “CAN'dır”
       		- Sayi hem 3’un hem 5’in kati ise sayi yerine “JavaCAN” print eden code create ediniz
        */
        Scanner input = new Scanner(System.in);
        System.out.println("Bir tam sayi giriniz :");
        int sayi = input.nextInt();

        if (sayi >=100 || sayi <1) {
            System.out.println("Please enter a valid number. (Between 1-99)");
        }else {
            for (int i = 1; i < sayi; i++) {
                if (i%3 == 0 && i%5 == 0) {
                    System.out.println("JavaCan");
                } else if (i%3 == 0) {
                    System.out.println("Java");
                } else if (i%5 == 0) {
                    System.out.println("CAN'dir");
                }
                } // we dont use else here not to print the numbers
            }
        }

    }

