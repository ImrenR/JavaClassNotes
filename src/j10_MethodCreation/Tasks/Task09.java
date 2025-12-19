package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {

    /*
   Task->  Saati saniyeye çeviren  method create ediniz
    */
        Scanner input = new Scanner(System.in);
        System.out.println("Bir saat giriniz :");
        int saat = input.nextInt();

        int hesap = 0;

       cevirSn(saat,hesap);


    }//main sonu

    private static void cevirSn(int saat, int hesap) {

        hesap += saat*3600;
        System.out.println(hesap);
    }


}// Class sonu
