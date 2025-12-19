package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        //task-> girilen iki sayının eşitliğini control eden METHOD create ediniz

Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz :");
        int num1 = input.nextInt();
        System.out.println("Sayi ikiyi giriniz :");
        int num2 = input.nextInt();

        controlNums(num1,num2); // sout asagida yapildi sadece method call edildi.
    }//main sonu

    private static void controlNums(int num1, int num2) {
        if (num1 == num2) {
            System.out.println("Sayilar esit");

        }else System.out.println("Sayilar esit degil");
    }


}//class sonu
