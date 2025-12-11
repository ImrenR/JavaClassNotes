package j10_MethodCreation;

import java.util.Scanner;

public class C02_MethodCreation {//Class level

    // task-> girilen 3 sayının ortalamasını print eden METHOD create ediniz

    public static void main(String[] args) {// main level

        System.out.println("ortlmAl1() = " + ortlmAl1());


    }

    private static double ortlmAl1() {
        System.out.println("Bir sayi gir");
      Scanner input = new Scanner(System.in);
      double toplam = 0;
        for (int i = 1; i <= 3 ; i++) {

            toplam += input.nextDouble();
        }
        return toplam/3;
    }


}//Class sonu
