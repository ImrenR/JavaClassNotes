package j08_Loops.Loop03_DoWhileLoop.Tasks;

import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {

        //Task-> girilen baslangic ve bitis karakterleri dahil
        // aradaki tum karakterleri pirnt eden code create ediniz


        Scanner input = new Scanner(System.in);
        System.out.println("baslangic karakteri giriniz :");
       char startCh = input.next().charAt(0);
        System.out.println("bitis karakteri girinz :");
char endCh=input.next().charAt(0);

char ch=startCh;
        do {
            System.out.println(ch + " ");
            ch++;
        }while (ch <=endCh);
        System.out.println();
    }
}
