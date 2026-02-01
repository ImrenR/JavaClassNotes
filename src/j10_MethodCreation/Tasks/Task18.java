package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {

       /* task-> girilen üç tamsaynın
        bir dik üçgenin kenar uzunlukları olamsını kontrol eden METHOD create ediniz.
        (Trick->: a b c kenarları için  a2+b2=c2 pisagor  şartı sağlanmalı)

        birinci kenarı giriniz: 3
        ikinci kenarı giriniz 4
        üçüncü kenarı giriniz: 5
         dik üçgendir
        birinci kenarı giriniz: 2
        ikinci kenarı giriniz 15
        üçüncü kenarı giriniz: 7
        dik üçgen değildir.*/

        Scanner input = new Scanner(System.in);
        System.out.println("1. tam girinz");
int a = input.nextInt();
        System.out.println("ikinci tamsayiyi giriniz"
        );
int b= input.nextInt();
        System.out.println("3. tamsayiyi giriniz");
int c= input.nextInt();
        dikUCgenMi(a,b,c);

    }

    private static void dikUCgenMi(int a, int b, int c) {
       int sonuc = (a*a)+ (b*b );
      if(sonuc == c*c) {
          System.out.println("Dikkucgendir");
      }else System.out.println("Dikucgen degildir");

    }
}
