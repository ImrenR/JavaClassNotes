package j11_Arrays.Tasks;

import java.util.Scanner;

public class Task05 {


    public static void main(String[] args) {
        // Task-> girilen int değeri tersten print
        // eden code create ediniz.


Scanner input = new Scanner(System.in);
        System.out.println("bir integer deger giriniz");
        int sayi=input.nextInt();

        int reversedNumber = 0 ;

        while(sayi !=0){
            int digit = sayi % 10; // Last number
            reversedNumber = reversedNumber * 10 + digit; // last number = reversedNumber
            sayi /=10; // input /10 => 123 / 10 = 12
        }
        System.out.println("reversedNumber = " + reversedNumber);
    }

}
