package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task05 {

    static Scanner input = new Scanner(System.in);//gunes eyledim ki herkeşler erişebile

    public static void main(String[] args) {

        // task-> girilen iki sayıyı seçilen dört işleme göre hesaplayıp print eden
        // METHOD create ediniz.
        // burada switch case kullanabiliriz mesela

        System.out.println("Bir sayi giriniz :");
        int num1 = input.nextInt();
        System.out.println("ikinci sayiyi giriniz :");
        int num2 = input.nextInt();
        System.out.println("Bir islem seciniz :");
        char islem = input.next().charAt(0);

        hesapla(num1,num2,islem);



    }//main sonu

    static void hesapla(int num1, int num2, char islem) {
        switch (islem){
            case '+':
                System.out.println("Sonuc :" + (num1 + num2));
                break;

            case '-':
                System.out.println("Sonuc :" + (num1-num2));
                break;
            case '*':
                System.out.println("Sonuc :" + (num1*num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println("Sonuc :" + (num1/num2));

                }else {
                    System.out.println("Bu islem icin ikinci sayi 0 olamaz");}
                break;

            default:
                System.out.println("Gecersiz bir islem yapildi");
        }
    }


}//Class sonu
