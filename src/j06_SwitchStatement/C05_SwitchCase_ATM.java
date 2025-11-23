package j06_SwitchStatement;

import java.util.Scanner;

public class C05_SwitchCase_ATM {

    public static void main(String[] args) {
        /*
        TaskATM-> Bakıye 1000$ olan bir banka hesabı için bakıye öğrenme-para çekme-para yatırma
         ve çıkış işlemlerinin yapıldığı bir ATM app. create ediniz.
         */
        Scanner input = new Scanner(System.in);
        int bakiye = 1000;
        System.out.println(" ATM ye hosgeldiniz :) ");
        System.out.println("1- Bakiyenizi gormek icin");
        System.out.println("2- Para eklemek icin");
        System.out.println("3- Para cekmek icin");
        System.out.println("4- Cikis Yapin");
        int sayi = input.nextInt();


        switch (sayi){
            case 1 :
                System.out.println("Bakiyeniz : " + bakiye);
                break;
            case 2:
                System.out.println("Yatiracaginiz miktari giriniz:");
               int addMoney=input.nextInt();
               bakiye += addMoney;
                System.out.println("Total bakiyeniz:" + bakiye);
                break;
            case 3:
                System.out.println("Cekilecek miktari giriniz :");
                int withdraw = input.nextInt();
                switch (withdraw> bakiye ? 1 : 2){
                    case 1:
                        System.out.println("Yetersiz Bakiye!");
                        break;
                    case 2:
                        bakiye -=withdraw;
                        System.out.println("Kalan bakiye : " + bakiye);
                        break;
                }
                break;
            case 4:
                System.out.println("Cikis yaptiniz. Iyi gunler");
        }

    }

}
