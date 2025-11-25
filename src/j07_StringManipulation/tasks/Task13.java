package j07_StringManipulation.tasks;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {

        //Task->  Girilen  String'deki space haric kac tane character
        // kullanildigini print eden code create ediniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Bir metin giriniz:");
        String text = input.nextLine();

int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i) != ' '){
                count ++;
            }
        }
        System.out.println(count);


    }
}
