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


// diyelim ki Imren Rahbay Java yazacagim
        int firstSpace = name.indexOf(" "); // firstspace index number
        int secondSpace = name.indexOf(" ",firstSpace +1); // second space index number

        String firstWord = name.substring(0,firstSpace);
        String secondWord = name.substring(firstSpace +1, secondSpace);
        String thirdWord = name.substring(secondSpace+1);

        String initials = Character.toUpperCase(firstWord.charAt(0)) + "."
                +Character.toUpperCase(secondWord.charAt(0)) + "." +
                Character.toUpperCase(thirdWord.charAt(0)) + ".";

        System.out.println(initials);
    }
}
