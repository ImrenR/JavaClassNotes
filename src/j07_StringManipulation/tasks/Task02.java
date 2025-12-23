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
        System.out.println("Parolaninizin ilk karakteri buyuk harf olmali");
        System.out.println("Son karakteri sayi olmalu");
        System.out.println("En az 6 karakter icermeli");
        System.out.println("Bir password giriniz");
        String pass = input.nextLine();

        char first =pass.charAt(0);
        char last = pass.charAt(pass.length()-1);

        if ( first < 'A' || first > 'Z') {
            System.out.println("Parolanin ilk karakteri bir harf ve buyuk olmalidir");
        }else if (last < '0' || last > '9'){
            System.out.println("Parolanizin son karakteri bir sayi olmalidir");
        } else if(pass.length()<6) {
            System.out.println("Parolanizin karakter sayisi 6 dan kucuk olamaz");
        }else System.out.println("Parolaniz basariyla olusturulmustur = " + pass);

    }
}
