package j04_JavaOperators.j01_AritmeticOperators.tasks;

import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {

        /* Task->
         * Kullanicinin girdigi 3 basamakli sayinin ilk ve son rakamlarinin toplamini veren programi yaziniz.
         */

       Scanner input = new Scanner(System.in);
        System.out.println("Bir rakam giriniz");
       int num1 = input.nextInt();
       int ilkRakam= (num1/100);
        System.out.println(ilkRakam);
       int SonRakam = (num1%10);
        System.out.println(SonRakam);
       int sonuc = (ilkRakam+SonRakam);
        System.out.println(sonuc);


    }

}
