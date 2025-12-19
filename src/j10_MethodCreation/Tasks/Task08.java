package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {

    /*
    Task->   girilen bir yılın artık (LEAP YEAR) olmasını kontrol eden code create ediniz..
            artık yıl:
            Kural1: 4 ile bölünemeyen yıllar artık yıl değildir.
            Kural2: 4 ile bölünüp 100 ile bölünemeyen yıllar artık yıldır.
            Kural3: 4’ün katı olmasına rağmen 100 ile bölünebilen yıllardan sadece  400’ün katı olan yıllar artık yıldır.

   input: 2023
   output:false
    */
        Scanner input = new Scanner(System.in);
        System.out.println("Bir yil giriniz :");
        int year = input.nextInt();

        System.out.println("Leap Yeardir = " + leapYearHesaplama(year));

    }//main sonu

    private static boolean leapYearHesaplama(int year) {
        if(year % 4 != 0){
            return false;

        } else if ((year % 100 !=0) || (year % 400 == 0)) {
            return true;

        }else
            System.out.println("Gecersiz islem");
            return false;
    }


}//Class sonu
