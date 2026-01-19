package j08_Loops.Loop03_DoWhileLoop.Tasks;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {

        //task-> Girilen ismin ilk harfinin buyuk olmasını kontrol eden code create ediniz.

Scanner input = new Scanner(System.in);

        String isim;

        do {
            System.out.println("Bir isim giriniz :");
         isim = input.nextLine();
            System.out.println("ismin ilk harfi buyuk degil");
        }while (!Character.isUpperCase(isim.charAt(0)));
        System.out.println("ismin ilk harfi buyuk");
    }
}
