package j07_StringManipulation.tasks;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        /*
        Task-> Girilen string içindeki istenen index'deki karakteri print eden code create ediniz
         */

                Scanner input = new Scanner(System.in);
                System.out.println("Enter a word:");
                String name= input.nextLine();

                System.out.println("Enter a index:");
                int index = input.nextInt();

        System.out.println("name.charAt(index) = " + name.charAt(index));


    }
        }



