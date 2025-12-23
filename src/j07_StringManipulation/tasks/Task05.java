package j07_StringManipulation.tasks;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
             /* Task->
        Girilen ad soyad bilgilerinin ilk harflerini buyuk harf print eden code create ediniz..

              */


        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name= input.nextLine();
        System.out.println("Enter your surname:");
        String surname = input.nextLine();

       String newName = name.substring(0,1).toUpperCase();
       String newSurname= surname.substring(0,1).toUpperCase();

        System.out.println(newName + " " + newSurname);
    }
}
