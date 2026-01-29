package j08_Loops.Loop03_DoWhileLoop.Tasks;

import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) { /*
    Task-> Girilen bir pozitif tamsayının tam kare olmasını kontrol eden code create ediniz.

     Ornek :  input : 16, output: 4 */


        Scanner input=new Scanner(System.in);
        System.out.println("Bir sayi giriniz :");
        int number;
        do {
           number=input.nextInt();
        }while (number<=0); // Ensure the input is a positive integer


        //Check if the number is a perfect square
        int square=(int) Math.sqrt(number);


        if(square*square == number) {
            System.out.println("tam kare:" +square);
        }else
            System.out.println("Tam kare degil!");
        }



    }

