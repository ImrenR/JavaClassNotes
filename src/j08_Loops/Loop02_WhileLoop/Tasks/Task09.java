package j08_Loops.Loop02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {


        // task-> istenilen kadar tamsayının toplamını print eden code create ediniz


        Scanner input = new Scanner(System.in);


        int sayac=1;
        int toplam=0;
        while(sayac<=5){
            System.out.println(sayac + ". sayiyi giriniz :");
            int sayi= input.nextInt();
            sayac++;
            toplam+=sayi;
        }
        System.out.println("toplam = " + toplam);
    }

}
