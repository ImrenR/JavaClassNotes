package j07_StringManipulation.tasks;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
       /*  TASK :
        Kullanıcıdan alacağınız, 3 kelimelik  ismi
         Örn. Haluk Bilgin Java -> H.B.J.  şeklinde print eden code create ediniz.
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word:");
        String name= input.nextLine();


int ilkBosluk = name.indexOf(" "); //
int ikinciBosluk =name.indexOf(" ",ilkBosluk+1);

String ad = name.substring(0,ilkBosluk);
String ikinciAd = name.substring(ilkBosluk+1, ikinciBosluk);
String ucuncuAd = name.substring(ikinciBosluk+1);

        String initials =
                Character.toUpperCase(ad.charAt(0)) + "." +
                        Character.toUpperCase(ikinciAd.charAt(0)) + "." +
                        Character.toUpperCase(ucuncuAd.charAt(0)) + ".";

        System.out.println(initials);


    }
}
