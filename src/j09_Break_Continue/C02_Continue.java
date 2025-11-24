package j09_Break_Continue;

import java.time.Year;
import java.util.Scanner;

public class C02_Continue {
    public static void main(String[] args) {
          /*
    Program, bir loop içerisinde continue komutu ile karşılaşılırsa, ondan sonraki komutları
    atlar ve loop’un bir sonraki değerinden devam eder.
    */

        // Task-> girilen bir mail hesabındaki ' ' karakterlerini handle ederek print eden code cerate ediniz.

        Scanner input = new Scanner(System.in);
        System.out.println("bir email adresi giriniz");
        String email = input.nextLine();
       String yeniMail = "";

        for (int i = 0; i < email.length(); i++) {
            if(email.charAt(i)== ' '){
                continue;
            }
            yeniMail += email.charAt(i);
        }
        System.out.println("yeniemail : " + yeniMail);
    }
}
