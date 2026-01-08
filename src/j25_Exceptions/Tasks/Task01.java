package j25_Exceptions.Tasks;

import java.util.Scanner;

public class Task01 {


    //custom checked exception
    static class PasswordException extends Exception{
        public PasswordException(String message){ // onstructor
            super(message);
        }
    }

    //methid olustur
    public static void validatePassword(String password) throws PasswordException {
        if(password==null){
            throw new NullPointerException("Password null olamaz!");
        }if(password.length()<6 || password.length()>10){
            throw new PasswordException("Password 6 ile 10 arasinda karakterde olmali");
        }
    }

    public static void main(String[] args) {
/*
  Task -> Girilen password'un 6 karakterden az 10 karakterden fazla olmamasını kontrol eden code create ediniz.
         */

Scanner input=new Scanner(System.in);
        System.out.println("Bir password giriniz : ");
        String password=input.nextLine();

try{
    validatePassword(password);
}catch (PasswordException e){
    System.out.println("e.getMessage() = " + e.getMessage());
}catch (NullPointerException e){
    System.out.println("e.getMessage() = " + e.getMessage());
}



    }
}
