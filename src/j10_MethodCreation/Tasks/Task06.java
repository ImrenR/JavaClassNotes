package j10_MethodCreation.Tasks;

import java.util.Scanner;

import static j10_MethodCreation.Tasks.Task05.hesapla;

public class Task06 {
    static Scanner input = new Scanner(System.in);//gunes eyledim ki herkeşler erişebile

    public static void main(String[] args) {
        //Task-> Girilen iki boyuta göre seçilen geometrik şeklin(kare, dikdörtgen , üçgen) alan ve
        // çevre değerlerini print eden METHOD  create ediniz

        System.out.println("Birinci boyutu gir : ");
        int boyut1 = input.nextInt();
        System.out.println("Ikinci boyutu gir :");
        int boyut2 = input.nextInt();
        System.out.println("Islem yapmak istediginiz sekli girinizi ilk harfi ile :");
        char sekil = input.next().charAt(0);

        hesaplA(boyut1,boyut2,sekil);


    }//main sonu

    private static void hesaplA(int boyut1, int boyut2, char sekil) {
        switch (sekil){
            case 'k':
                System.out.println("Karenin alani:" + (boyut1*boyut1));
                System.out.println("Karenin cevresi : " + (4*boyut1));
                break;
            case 'd':
                System.out.println("Dikdortgenin alani:" + (boyut1*boyut2));
                System.out.println("Dikdortgenin cevresi : " + (2*(boyut1+boyut2)));
                break;
            case 'u':
                System.out.println("UCgenin yuksekligini giriniz :");
                int h = input.nextInt();
                System.out.println("Ucgen alani:" + (boyut1*h)/2);
                System.out.println("Ucgen cevresi : " + (3*boyut1));
                break;

            default:
                System.out.println("Islem gecersizdir.");
        }

    }


}//Class sonu
