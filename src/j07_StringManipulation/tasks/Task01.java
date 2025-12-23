package j07_StringManipulation.tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        // Task->  Girilen  bir stringde boşluk karakterinin olup olmadığını kontrol eden code create ediniz


        Scanner input = new Scanner(System.in);
        System.out.println("Bir string giriniz");
        String word = input.nextLine();

        System.out.println("word.contains(\" \") = " + word.contains(" ")); // true ( Selam olsun sana girilen string)
    }
}

