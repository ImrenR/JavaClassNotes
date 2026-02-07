package j12_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
  /* TASK :
   Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
   toplamını bulan code create ediniz.
    */
        Scanner input = new Scanner(System.in);
        System.out.println("Kac adet sayi girmek istiyorsunuz : ");
        int sayilar= input.nextInt();


        int i=1;
        List<Integer> liste = new ArrayList<>();


        while(i<=sayilar) {
            System.out.println(i + " . sayiyi giriniz :");
            liste.add(input.nextInt());
            i++;
        } // girilen sayilar listeye eklendi

       int sonuc = sayilarinKaresininToplami(liste);
        System.out.println("sonuc = " + sonuc);
    }

    private static int sayilarinKaresininToplami(List<Integer> liste) {
        int toplam = 0;
        for(int avuc: liste) {
            toplam+= avuc*avuc;
        }
        return toplam;
    }
}
