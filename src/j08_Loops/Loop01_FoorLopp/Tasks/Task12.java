package j08_Loops.Loop01_FoorLopp.Tasks;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        /*
        Task -> girilen 5 sayının 10 ile 20 arası hariç diğerlerinin
        toplamının print eden code create ediniz
         */

        Scanner input = new Scanner(System.in);

      // totalde 5 sayi girilecek bu sayilar dondukce toplanmali bu yuzden for loop dong kullanirim

        int toplam = 0; // initial value of toplam

        for (int i = 1; i <=5; i++) {
            System.out.println(i + ". sayiyi giriniz: ");
            int number = input.nextInt();
            if (number>=10 && number<=20) {
                continue;
            }
            toplam += number;
        }

        System.out.println("toplam = " + toplam);
    }
}
