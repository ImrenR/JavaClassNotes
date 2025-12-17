package j04_JavaOperators.j01_AritmeticOperators.tasks;

import java.util.Scanner;

public class _10_Arithmetic_Operator_multiply3 {

    public static void main(String[] args) {

        /* Oluşturulmuş olan int ler hakkında, (num1, num2 , num3, num4),
        Bu int'leri birbiriyle çarpın ve sonuca eşitleyin.
        int sonuc u yazdırın. */

        Scanner dp = new Scanner(System.in);
        System.out.println("num1 sayisini giriniz:" );
        int num1 = dp.nextInt();
        System.out.println("num2 sayisini giriniz:" );
        int num2 = dp.nextInt();
        System.out.println("num3 sayisini giriniz:" );
        int num3 = dp.nextInt();
        System.out.println("num4 sayisini giriniz:" );
        int num4 = dp.nextInt();

        int sonuc = num1*num2*num3*num4;

        System.out.println("sonuc = " + sonuc);
        //Kodu aşağıya yazınız.




    }
}
