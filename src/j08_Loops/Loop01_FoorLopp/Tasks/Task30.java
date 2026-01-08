package j08_Loops.Loop01_FoorLopp.Tasks;

import java.util.Scanner;

public class Task30 {

    public static void main(String[] args) {
        // task-> girilen iki tamsayı arasındaki tamsayıların toplamını print eden code create ediniz
        Scanner input = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int num1= input.nextInt();;
        System.out.println("ikinci sayiyi giriniz");
        int num2= input.nextInt();


        int result=0;

        if (num1>num2){
            for (int i = num2; i < num1; i++) {
                result+=i;
            }
            System.out.println("result = " + result);
        }else
            System.out.println("ilk sayi daha buyuk olmalidir");
    }
}
