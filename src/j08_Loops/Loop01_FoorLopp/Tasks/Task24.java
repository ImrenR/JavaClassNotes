package j08_Loops.Loop01_FoorLopp.Tasks;

import java.util.Scanner;

public class Task24 {

    public static void main(String[] args) {
		/*
		 Task -> girilen  String'in tersini(reverse String) print eden code create ediniz
		 */

        Scanner input = new Scanner(System.in);
        System.out.println("Bir string giriniz :");
        String cumle = input.next();

        for (int i = cumle.length()-1; i >=0; i--) {
            System.out.print(cumle.charAt(i));
        }

    }

}
