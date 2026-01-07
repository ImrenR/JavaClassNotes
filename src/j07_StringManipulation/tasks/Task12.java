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
        String name = input.nextLine();

String []words= name.split(" ");

if(words.length==3){
    System.out.println(
            words[0].charAt(0) + "." + words[1].charAt(0) + "." + words[2].charAt(0) + "."
    );
}else System.out.println("3 kelimelik bir sey yaziniz");

// diyelim ki Imren Rahbay Java yazacagim
    }
}
