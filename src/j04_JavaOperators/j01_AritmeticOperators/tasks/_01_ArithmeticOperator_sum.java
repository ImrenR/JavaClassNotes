package j04_JavaOperators.j01_AritmeticOperators.tasks;

import java.util.Scanner;

public class _01_ArithmeticOperator_sum {
    public static void main(String[] args) {

    /*    Verilen iki tane int  (num1 , num2),
        Bu iki Integer'in toplamını yazdırın. */

        Scanner dp = new Scanner(System.in);
        System.out.println("num1 = ");
        int num1 = dp.nextInt();
        System.out.println("num2 = ");
        int num2 = dp.nextInt();

        int toplam = num1 + num2;

        System.out.println("toplam = " + toplam);
        //Kodu aşağıya yazınız.


    }
}
