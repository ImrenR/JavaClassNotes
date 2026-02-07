package j05_ifStatementTernaryOperator;

import java.util.Scanner;

public class C07_NestedTernaryOperator {
    public static void main(String[] args) {
         /*
        TASK :
        Girilen bir pozitif tamsayı  4 basamaklı ise  “4 Basamaklı”
        degilse çift olup olmadigini kontrol edip. Çift ise “4 basamaklı olmayan çift sayı”
        degilse “4 basamaklı olmayan tek sayı"  print eden code create ediniz.
         */


Scanner input = new Scanner(System.in);
        System.out.println("Bir pozitif sayi giriniz :");
        int sayi = input.nextInt();

       String sonuc = (sayi >=1000 && sayi<= 9999)
               ? "4 basamakli bir sayi girdiniz"
               : (sayi%2 ==0 )
               ? "4 basamkli olmayan cift sayi"
               : "4 basamakli tek sayi";
        System.out.println("sonuc = " + sonuc);
    }



}
