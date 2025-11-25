package j07_StringManipulation.tasks;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
      /* TASK :
       Kullanıcıdan tek seferde alınan ad soyadı ifadeyi
      ad ve soyadı ayrı ayrı print eden code create ediniz
       */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word:");
        String name= input.nextLine();

int boslukIndex = name.indexOf(" ");

String ad = name.substring(0,boslukIndex);
String soyad = name.substring(boslukIndex + 1);

        System.out.println("Ad : " + ad);
        System.out.println("Soyad : " + soyad);


    }
}
