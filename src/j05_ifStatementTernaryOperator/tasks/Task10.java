package j05_ifStatementTernaryOperator.tasks;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        /* Task->
         Kullanicidan 100 uzerinden notunu isteyin.
         Not’u harf sistemine cevirip yazdirin.
         50’den kucukse “D”,->1,2,3..49
         =50  <60 arasi “C”,->50,51,52,..59
         =60  <80 arasi “B”,->60,61,62,63..79
         =80’nin uzerinde ise “A”->80,81..100
         */

Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number less than 100 :");
        int rakam = input.nextInt();

        if (rakam <50 ) {
            System.out.println("D");
        } else if (rakam>=50 && rakam <=60) {
            System.out.println("C");
        } else if (rakam >=60 && rakam<=80) {
            System.out.println("B");
        }else System.out.println("A");


    }


}
