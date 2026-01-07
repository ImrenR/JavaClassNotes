package j08_Loops.Loop01_FoorLopp.Tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /* task-> interview question
        girilen ifadenin polindrome olmasını kontrol eden code create ediniz...
        plindrome:her iki yönde okundugunda eşit olan ifadeler :ece, ada etc.

         */

        Scanner input = new Scanner(System.in);
        System.out.println("bir kelime giriniz:");
        String a= input.nextLine();

        if(a.length()==3){
           if(a.charAt(0) == a.charAt(2) && a.charAt(0) != a.charAt(1)){
               System.out.println("girdiginiz kelime polindromedur = " + a);
           }else System.out.println("girdiginiz kelime polindrome degildir = "+ a);
        }else System.out.println("3 harflik bir kelime giriniz.");

    }


}
