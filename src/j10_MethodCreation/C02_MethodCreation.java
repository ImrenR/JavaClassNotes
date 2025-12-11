package j10_MethodCreation;

import java.util.Scanner;

public class C02_MethodCreation {//Class level

    // task-> girilen 3 sayının ortalamasını print eden METHOD create ediniz

    public static void main(String[] args) {// main level

        System.out.println("ortlmAl1() = " + ortlmAl1());
ortlmAl2();

    }

    //1. method void ile :
    private static void ortlmAl2() {

        Scanner input = new Scanner(System.in);
        double toplam = 0;
        for (int i = 1; i <= 3 ; i++) {
            System.out.println(i + ".  sayiyi giriniz");
            toplam += input.nextDouble();
        }
        System.out.println("toplam/3 = " + toplam / 3); // sadece bir deger versin istiyorsak (void) sout u buraya atarim
    }

    //2. method double ile:
    private static double ortlmAl1() {

      Scanner input = new Scanner(System.in);
      double toplam = 0;

        for (int i = 1; i <= 3 ; i++) {
            System.out.println(i + ".  sayiyi giriniz");
            toplam += input.nextDouble();
        }
        return toplam/3;
    }


}//Class sonu
