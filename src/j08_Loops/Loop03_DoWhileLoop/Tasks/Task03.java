package j08_Loops.Loop03_DoWhileLoop.Tasks;

import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) { /*
    Task-> Girilen bir pozitif tamsayının tam kare olmasını kontrol eden code create ediniz.

     Ornek :  input : 16, output: 4 */


        Scanner input=new Scanner(System.in);
        System.out.println("Bir tam sayi giriniz :");
         int sayi;

        do {
            sayi=input.nextInt();


            }while (sayi<=0); // negatif veya 0 ise tekrar sor

        double karekok = Math.sqrt(sayi);

        if(karekok ==(int) karekok) {
            System.out.println("Bu sayi bir tam karedir =" + (int) karekok);
        }else
            System.out.println("Bu sayi tam kare degildir");
        }



    }

