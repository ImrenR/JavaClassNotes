package j08_Loops.Loop03_DoWhileLoop.Tasks;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {

        //task-> Girilen ismin ilk harfinin buyuk olmasını kontrol eden code create ediniz.

Scanner input = new Scanner(System.in);

        String kelime;
        char ch;
        do {
            System.out.println("Bir isim giriniz :");
            kelime=input.nextLine();
            ch=kelime.charAt(0); // ilk harfi all

            if(Character.isUpperCase(ch)){
                System.out.println("Ilk harfi buyuk =" + ch);
                break; // Ilk harf buyukse donguyu sonlandir
            }else {
                System.out.println("Ilk harfi kucuk, lutfen tekrar giriniz");
            }
        }while(true); // sonsuz dongu, kosul saglanana kadar devam eder

    }
}
