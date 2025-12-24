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

        int indexSpace = name.indexOf(' ');

        if(indexSpace != -1){
            String ad = name.substring(0,indexSpace);
            String soyad = name.substring(indexSpace+1);

            System.out.println(ad);
            System.out.println(soyad);
        }else {
            System.out.println("Gecersiz");
        }






    }
}
