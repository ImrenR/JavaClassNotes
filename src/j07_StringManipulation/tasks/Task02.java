package j07_StringManipulation.tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*  Task->
		 	Girilen passwordun aşagıdaki şartları sağlamasını kontrol eden coden create ediniz
		 	 a)Ilk karakteri buyuk harf olmalı //
		 	 b)Son karakteri sayi olamlı
		 	 c)en az 6 karakter uzunlugunda olmalı
		 */

Scanner input = new Scanner(System.in);
        System.out.println("enter a valid  password:");
        String password = input.nextLine();

        boolean ilkBuyuk = Character.isUpperCase(password.charAt(0));
        boolean sonBuyuk = Character.isDigit(password.charAt(password.length()-1));
        boolean uzunluk = password.length()<=6;

        if(ilkBuyuk && sonBuyuk && uzunluk) {
            System.out.println("Password is valid");
        }else {
            System.out.println("Password is invalid");
            if(!ilkBuyuk){
                System.out.println("First character has to be capital");
            }
            if(!sonBuyuk){
                System.out.println("Last character has to be a number");
            }
            if(!uzunluk){
                System.out.println("Password has to be less than 6 characters");
            }
        }

    }
}
