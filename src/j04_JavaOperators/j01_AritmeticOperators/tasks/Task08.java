package j04_JavaOperators.j01_AritmeticOperators.tasks;

import java.util.Scanner;

public class Task08 {
    /*Task->
     * Saniyeyi saat, dk ve saniyeye çeviren bir program yazınız.
     * 		Örnek : 4250 - > 1 saat 10 dakika 50 saniye
     * 1 saat = 3600 saniye
     * 1 dk   = 60 saniye
     *
     */

    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);
        System.out.println("Bir rakam giriniz :");
        int rakam =input.nextInt();
        int hour = (rakam/3600);
        System.out.println("hour = " + hour);
        int min = ((rakam%3600)/60);
        System.out.println("min = " + min);
        int sn=(rakam-(hour*3600)-(min*60));
        System.out.println("sn = " + sn);


    }
}
