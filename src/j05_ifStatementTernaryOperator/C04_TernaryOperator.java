package j05_ifStatementTernaryOperator;

import java.util.Scanner;

public class C04_TernaryOperator {


    public static void main(String[] args) {
        // Task -> girilen bir tamsayının 2 veya daha fazla basamaklı olmasını kontrol eden code create ediniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Bir tamsayi sayi giriniz");
        int sayi = input.nextInt();;

     String sonuc = Math.abs(sayi) >= 10
             ? "Sayi 2 veya daha fazla basamaklidir"
             : "Sayi tek basamaklidir";

        System.out.println(sonuc);

    }
}





