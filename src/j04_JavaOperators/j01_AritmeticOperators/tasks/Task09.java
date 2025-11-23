package j04_JavaOperators.j01_AritmeticOperators.tasks;

import java.util.Scanner;

public class Task09 {


    /*Task->
     Çiftlikteki hayvanların ayaklarının toplam sayısını bulma.
     Çiftlikteki bulunun inek, koyun, tavukların ayak sayısını print eden code create ediniz.

     */

    public static void main(String[] args) {

Scanner hayvan = new Scanner(System.in);
        System.out.println("ciftlikteki inek sayisini giriniz :");
        int inek = hayvan.nextInt();
        int inekAyak = (inek*4);
        System.out.println("inekAyak = " + inekAyak);
        System.out.println("Ciftlikteki koyun sayisini giriniz:");
        int koyun = hayvan.nextInt();
        int koyunAyak = (koyun*4);
        System.out.println("koyunAyak = " + koyunAyak);
        int tavuk =  hayvan.nextInt();
        int tavukAyak= (tavuk*2);
        System.out.println("tavukAyak = " + tavukAyak);
    }

}
