package j08_Loops.Loop02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        /*
    task -> 0 (sıfır) girilene kadar girilen tum sayıların adedini ve toplamını print eden code create edinz.
    */

Scanner input = new Scanner(System.in);

       int sayac=0;
       int toplam=0;
        System.out.println("Sayı giriniz (0 girerseniz çıkış yapar):");
        int sayi = input.nextInt();

      while(sayi !=0){
      toplam+=sayi;
      sayac++;

    System.out.println("sayi giriniz :");
    sayi = input.nextInt();

}

        System.out.println("Girilen sayi adedi = " + sayac);
        System.out.println("girilen sayilarin toplami = " + toplam);

    }
}
