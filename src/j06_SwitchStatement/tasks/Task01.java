package j06_SwitchStatement.tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        //Task->  Girilen bir tamsayının onlar basamağının harf karakteri ile  print eden code create ediniz.

Scanner input = new Scanner(System.in);
        System.out.println("Bir rakam giriniz:");
        int sayi = input.nextInt();
 int onlarBasamagi = (sayi/10)%10;

        switch (onlarBasamagi) {
            case 0: System.out.println("zero"); break;
            case 1: System.out.println("one"); break;
            case 2: System.out.println("two"); break;
            case 3: System.out.println("three"); break;
            case 4: System.out.println("four"); break;
            case 5: System.out.println("five"); break;
            case 6: System.out.println("six"); break;
            case 7: System.out.println("seven"); break;
            case 8: System.out.println("eight"); break;
            case 9: System.out.println("nine"); break;
            default: System.out.println("Hata!");
        }



    }
}
