package j11_Arrays.Tasks;

import java.util.Scanner;

public class _21_Array_reverse {

    public static void main(String[] args) {

        /*
        Girilen 123 Intiger'ının basamaklarını ters çevirin.
        Örnek:
        Input(girdi): 123
        Output(çıktı): 321
         */

        //Kodu aşağıya yazınız.
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
// Ters çevirme işlemi

        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10; // Son basamağı al
            reversedNumber = reversedNumber * 10 + digit; // Ters çevir
            number /= 10; // Son basamağı çıkar
        }

        // Sonucu yazdır
        System.out.println("Ters çevrilmiş sayı: " + reversedNumber);




    }
}


