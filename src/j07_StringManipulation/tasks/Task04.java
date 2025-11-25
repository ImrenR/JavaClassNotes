package j07_StringManipulation.tasks;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {

        /*
         Task->
         Girilen iki kelimeden ilki çift sayıda karakter içeriyorsa 2. kelimeyi 1. kelimenin ortasına print eden
         ilk kelime tek sayıda karakter içeriyorsa "kelime2 kelime1 eklenemez" print eden code create ediniz
         name1= Java
         name2= haluk
         Print ==> Jahalukva
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first word:");
        String a= input.nextLine();
        System.out.println("Enter second word:");
        String b = input.nextLine();

         if(a.length()%2==0){
            int orta = a.length()/2;
            String newWord = a.substring(0, orta) + b + a.substring(orta);
             System.out.println(newWord);
         }else {
             System.out.println("Kelime2 kelime1 e eklenemez");
         }















    }
}
