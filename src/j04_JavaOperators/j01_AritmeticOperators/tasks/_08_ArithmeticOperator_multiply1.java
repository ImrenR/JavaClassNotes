package j04_JavaOperators.j01_AritmeticOperators.tasks;

import java.util.Scanner;

public class _08_ArithmeticOperator_multiply1 {

    public static void main(String[] args) {

        /* Verilen 3 double hakkında, (num1 , num2, num3),
            Bu üç double'ı birbiriyle çarpın ve cevabı  sonuca eşitleyin.
            Sonucu yazdırın.  */

        Scanner dp = new Scanner(System.in);
        System.out.println("num1 sayisini giriniz :");

        double num1 = dp.nextDouble();
        System.out.println("num2 sayisini giriniz :");
        double num2 = dp.nextDouble();
        System.out.println("num3 sayisini giriniz :");
        double num3 = dp.nextDouble();

        double sonuc = num1*num2*num3;

        System.out.println("sonuc = " + sonuc);
        //Kodu aşağıya yazınız.




    }
}
