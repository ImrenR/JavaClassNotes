package j08_Loops.Loop01_FoorLopp.Tasks;

import java.util.Scanner;

public class Task16 {

    /*
     task-> Girilen sayının asal(prime) olmasını kontrol eden code create ediniz.
     * */
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = input.nextInt();

        boolean isPrime = true; //we assumed the number is prime at first

        if(num <2){
            isPrime = false; // number less than 2 is not a prime

        }else {
            for (int i = 2; i <=Math.sqrt(num) ; i++) { // check all possible divisors up to sprt num
                if (num%i == 0) {
                    isPrime=false;
                    break;
                }

            }
        }
    if (isPrime){
        System.out.println(num + " is a prime number");
    }else System.out.println(num + " is not a prime number");




    }
}
