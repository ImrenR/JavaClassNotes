package j10_MethodCreation;

import java.util.Scanner;

public class C02_MethodCreation {//Class level
    // task-> girilen 3 sayının ortalamasını print eden METHOD create ediniz

    public static void main(String[] args) {// main level

        System.out.println("ortalamaAl() = " + ortalamaAl());
         ortalamaAl1(); // istedigin yerde call edebilirim bu da ikinci yontem bu sekilde
        //yapildigin method da return yazilmaz ama double void ile degistirilir.

    }//main sonu

    private static double ortalamaAl() {
        Scanner input = new Scanner(System.in);
        double toplam=0; // bos-> girilen sayilarin toplanacagi container tanimlandi.
        for (int i = 1; i <=3 ; i++) { // 3 tekrar ile kullanicidan deger alip toplayan loop
            System.out.println(i + ". sayi giriniz:");

            toplam+=input.nextDouble();
        }
      return toplam/3;
    }
    private static void ortalamaAl1() {
        Scanner input = new Scanner(System.in);
        double toplam=0; // bos-> girilen sayilarin toplanacagi container tanimlandi.
        for (int i = 1; i <=3 ; i++) { // 3 tekrar ile kullanicidan deger alip toplayan loop
            System.out.println(i + ". sayi giriniz:");

            toplam+=input.nextDouble();
        }
       System.out.println("toplam:" + toplam/3);
    }


}//Class sonu
