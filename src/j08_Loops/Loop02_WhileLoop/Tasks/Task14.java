package j08_Loops.Loop02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task14 {

    //Task-> Girilen iki sayının EBOB ve EKOK değerlerini "While Döngüsü" prnt eden code create ediniz.

    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);

        System.out.println("Birinci sayiyi giriniz: ");
        int a = input.nextInt();
        System.out.println("Ikinci sayiyi giriniz: ");
        int b = input.nextInt();


        int ebob=1;
        int i=1;

        while(i<=a && i<=b){
            if(a%i == 0 && b%i ==0){
                ebob=i;
            }
            i++;
        }
        int ekok=(a*b)/ebob;
        System.out.println("ebob = " + ebob);
        System.out.println("ekok = " + ekok);
    }
}
