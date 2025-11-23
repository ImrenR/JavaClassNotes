package j04_JavaOperators.j01_AritmeticOperators.tasks;

import java.util.Scanner;

public class _04_ArithmeticOperator_subtract2 {

    public static void main(String[] args) {

        /*
        Verilen 4 tane int (num 1, num2 , num3 , num4),
        Int'leri birbirinden çıkarın.
        Sonucu yazdırın.
        Örneğin;
        num1 = 90
        num2 = 40
        num3 = 10
        num4 = 10
        Sonuc 30 olmalı.
         */

        Scanner dp = new Scanner(System.in);
        System.out.println("num1");
        int num1 = dp.nextInt();
        System.out.println("num2");
        int num2 = dp.nextInt();
        System.out.println("num3");
        int num3 = dp.nextInt();
        System.out.println("num4");
        int num4 = dp.nextInt();


        System.out.println(num1-num2-num3-num4);

        //Kodu aşağıya yazınız.


    }
}
