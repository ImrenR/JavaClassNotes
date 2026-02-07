package j05_ifStatementTernaryOperator;

import java.util.Scanner;

public class C05_TernaryOperator {

    public static void main(String[] args) {
        // Task-> girilen bir tamsayının ciftse yarısını  değilse "agıdeşşş tek'in yarısı tam olmazzz" print eden code create ediniz.


Scanner input = new Scanner(System.in);
        System.out.println("Bir tamsayi giriniz :");
        int sayi = input.nextInt();
        int toplam = 0;

        if(sayi%2 ==0){
            toplam +=sayi/2;
            System.out.println("toplam = " + toplam);
        }else System.out.println("agıdeşşş tek'in yarısı tam olmazzz");



    }


}
