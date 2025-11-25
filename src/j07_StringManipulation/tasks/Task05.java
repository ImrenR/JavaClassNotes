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

        String newName = Character.toUpperCase(name.charAt(0)) + name.substring(1);
        String newSurname = Character.toUpperCase(surname.charAt(0)) + surname.substring(1);

        System.out.println(newName +" "+ newSurname);
    }
}
