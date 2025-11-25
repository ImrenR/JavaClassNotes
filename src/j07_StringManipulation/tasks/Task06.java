package j07_StringManipulation.tasks;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {

        /*
        Girilen String'in son karakterini silen code create ediniz...
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name= input.nextLine();

       String newWord = name.substring(0,name.length()-1);

        System.out.println(newWord);

    }
}
