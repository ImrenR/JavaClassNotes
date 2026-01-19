package j08_Loops.Loop02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        // task ->  Girilen bir sayıya kadar  olan tek sayıları print eden code create ediniz.
// 5 giriliyorsa 5 ten 1 e kadar gibi


        Scanner input =new Scanner(System.in);
     System.out.println("Bi sayiyi giriniz : ");
        int sayi= input.nextInt();
       int i =1;
        while(i<=sayi){

            if(i %2 !=0){
                System.out.print( i + " ");

            }
            i++;
        }

    }
}
