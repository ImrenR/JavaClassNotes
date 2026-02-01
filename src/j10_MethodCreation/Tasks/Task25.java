package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task25 {


    public static void main(String[] args) {

    //task-> girilen sayını faktoriyelini print eden METHOD create ediniz
// 4! = 1*2*3*4 = 24

        Scanner input=new Scanner(System.in);
        System.out.println("Bir sayi giriniz = " );
        int number= input.nextInt();


        // Faktoriyel Hesaplama
        long factorial =calculateFactorial(number);
        System.out.println("factorial = " + factorial);
    }

    private static long calculateFactorial(int number) {
        long result =1;
        for (int i = 1; i <=number; i++) { // carpim oldugu icin 0 olamaz 0 yutar
            result*=i;
            
        }
        return result;
    }
}
