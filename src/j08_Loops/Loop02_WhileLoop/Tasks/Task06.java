package j08_Loops.Loop02_WhileLoop.Tasks;

import java.util.Random;
import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {
        /*
        1 ile 100    sayi arasındaki  pc'nin atadığı tamsayıyı
        kullanıcıya tahmin ettirip
        tahmin sayısını print eden  code create ediniz.
         */

        Scanner input=new Scanner(System.in);
        Random sayi=new Random();

        int pcSayisi= sayi.nextInt(100) +1; // 1-100 arasinda bir sayi verecek pc
        int tahmin = 0; // benim tahminim
        int tahminSayisi=0;

        while(tahmin != pcSayisi){
            System.out.println("tahmini gir :");
            tahmin=input.nextInt();
            tahminSayisi++;

            if(tahmin>pcSayisi){
                System.out.println("Daha kucuk bir sayi giriniz");
            } else if (tahmin<pcSayisi) {
                System.out.println("Daha buyuk bbir sayi giriniz");
            }
        }

        System.out.println("tahminSayisi = " + tahminSayisi);
    }


}
