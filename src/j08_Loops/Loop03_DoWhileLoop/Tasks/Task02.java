package j08_Loops.Loop03_DoWhileLoop.Tasks;

import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {

        //Task-> girilen baslangic ve bitis karakterleri dahil
        // aradaki tum karakterleri pirnt eden code create ediniz


        Scanner input = new Scanner(System.in);

        System.out.println("Baslangic karakterini giriniz : ");
        char start = input.next().charAt(0);

        System.out.println("Bitis karakterini giriniz : ");
        char end = input.next().charAt(0);

        char ch=start;

        do {
            System.out.print(ch+ " ");
            ch++;
        }while (ch<=end);

    }
}
