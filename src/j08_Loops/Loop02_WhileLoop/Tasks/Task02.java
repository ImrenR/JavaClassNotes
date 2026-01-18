package j08_Loops.Loop02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

        /*

        task-> girilen iki tamsayı arasındaki tamsayıları print eden code create ediniz.
        for loop & while lopp

         */

        Scanner sc=new Scanner(System.in);
        System.out.println("Sayi1 i giriniz :");
        int sayi1=sc.nextInt();
        System.out.println("Sayi2 yi giriniz :");
        int sayi2= sc.nextInt();

        int i=sayi1 + 1; // sayi1 dahil degil

        //while lopp ile cozum
        System.out.println("While loop cozumu : ");
        while (i<sayi2){
            System.out.print(i + " ");
            i++;
        }



    }
}
