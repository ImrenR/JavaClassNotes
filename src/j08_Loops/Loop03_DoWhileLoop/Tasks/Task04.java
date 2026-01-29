package j08_Loops.Loop03_DoWhileLoop.Tasks;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {

        //task-> bir ondalik sayinin ondalik kismindaki rakamlarinin toplamini bulunuz.
        //             24.5673 ==>    5+6+7+3 = 21


        Scanner input = new Scanner(System.in);
        System.out.println("Ondalik bir sayi giriniz :");
        double sayi=input.nextDouble();


        int toplam=0;
        int ondalikKisim = (int) ((sayi - (int)sayi)* 10000);

        do {
           toplam +=ondalikKisim % 10; // ondalik kisim 5673%10 = 3 son basamak => 567%10 => son basamak 7
           ondalikKisim /= 10; // 5673/10 = 567 => 56
        }while (ondalikKisim>0);
        System.out.println(toplam);

    }
}
