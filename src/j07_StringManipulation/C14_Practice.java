package j07_StringManipulation;

import java.util.Scanner;

public class C14_Practice {
    public static void main(String[] args) {
        /*Task-> Girilen bir String'deki bir karakterin tekrarlı veya tekrarsız
         olmasını kontrol eden code create ediniz
       Ör: Helloooo==> H-> Tekrarsız     e-->Tekrarsız   l--> Tekrarlı   o-->Tekrarlı
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Bir String giriniz: ");
        String str = input.nextLine();


        for (int i = 0; i < str.length(); i++) {
            char ch =str.charAt(i);

            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                System.out.println(ch + "=> Tekrarsiz");
            }else System.out.println(ch + "=> Tekrarli");
        }

    }
}
