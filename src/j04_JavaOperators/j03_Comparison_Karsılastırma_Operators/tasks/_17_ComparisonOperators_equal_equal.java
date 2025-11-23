package j04_JavaOperators.j03_Comparison_Karsılastırma_Operators.tasks;

import java.util.Scanner;

public class _17_ComparisonOperators_equal_equal {

    public static void main(String[] args) {

        /*  Verilen iki tane int (num1, num2) ile ilgili,
            Eger num1  num2 ya  eşitse console'da true yazsın.
            Değilse false  */

        Scanner dp = new Scanner(System.in);
        System.out.println("num1:");
        int num1 = dp.nextInt();
        System.out.println("num2 :");
        int num2 = dp.nextInt();

        boolean sonuc = num1==num2;
        System.out.println("sonuc = " + sonuc);

        // Kodu aşağıya yazınız.


    }
}
