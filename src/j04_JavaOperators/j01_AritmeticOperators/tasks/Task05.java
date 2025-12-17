package j04_JavaOperators.j01_AritmeticOperators.tasks;

import java.util.Scanner;

public class Task05 {

    /*
    Task->
     * Girilen saati  saniyeye çeviren program yazınız
     * Örnek : 1 saat 10 dakika 50 saniye - > 4250 saniye
     * 1 saat = 3600 saniye
     * 1 dk   = 60 saniye
     *
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Saati giriniz : ");
        int girilenSaat = input.nextInt();
        System.out.println("Dakikayi giriniz :");
        int girilenDk = input.nextInt();
        System.out.println("sn yi giriniz :");
        int girilenSn = input.nextInt();

        int saat= 3600;
        int dk = 60;
       int sonuc = (girilenSaat*saat) + (girilenDk*dk) + girilenSn;

        System.out.println("sonuc = " + sonuc);
    }

}



























