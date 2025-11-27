package j10_MethodCreation;

import java.util.Scanner;

public class C02_MethodCreation {//Class level
    // task-> girilen 3 sayının ortalamasını print eden METHOD create ediniz

    public static void main(String[] args) {// main level
// method main icinde call edilir.
       double sayi = ortalamaAl();
        System.out.println(sayi);
        System.out.println(" *********** ");
        ortalamaAl1(); // direkt sonucu versin dersek bu metotta void kullanir soutu asagida atarim.
    }//main sonu

   // class icinde method yazilir.
    public static double ortalamaAl(){
        Scanner input = new Scanner(System.in);
        double toplam = 0 ; // bos -> girilen sayilarin toplanacagi container tanimlandi.

        for (int i = 1; i <=3 ; i++) {
            System.out.println(i + ". sayi giriniz :");

            toplam += input.nextDouble();

        }
        return toplam/3;
    }

    public static void ortalamaAl1(){
        Scanner input = new Scanner(System.in);
        double toplam = 0 ; // bos -> girilen sayilarin toplanacagi container tanimlandi.

        for (int i = 1; i <=3 ; i++) {
            System.out.println(i + ". sayi giriniz :");

            toplam += input.nextDouble();

        }
        System.out.println("toplam/3 = " + toplam / 3);
    }



}//Class sonu
