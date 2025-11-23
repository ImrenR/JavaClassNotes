package j04_JavaOperators.j01_AritmeticOperators.tasks;

import java.util.Scanner;

public class _11_ArithmeticOperator_reminder1 {

    public static void main(String[] args) {

        /*  Verilen int ler hakkında (num1, num2),
            num1 'in   num2'ye bölümünden kalanı, int sonuc'a  eşitleyin.
            int sonucu yazdırın.  */

        Scanner dp = new Scanner(System.in);
        System.out.println("num1");
        int num1 = dp.nextInt();
        System.out.println("num2");
        int num2 = dp.nextInt();
        int sonuc = (num1%num2);
        System.out.println(sonuc);
        //Kodu aşağıya yazınız.



    }
}
