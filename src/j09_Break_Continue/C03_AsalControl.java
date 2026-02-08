package j09_Break_Continue;

import java.util.Scanner;

public class C03_AsalControl {
    public static void main(String[] args) {
        //task-> girilen tamsayının asal olmasını kontrol eden code create ediniz
        //asal tamsayı: 1 ve kendisinden başka tam böleni olmayan sayılar->asil bölünemeyen sayı

        Scanner input=new Scanner(System.in);
        System.out.println("Bir tamsayiyi giriniz:");
        int sayi = input.nextInt();

        boolean asal=true;

        if(sayi<=1) {
            asal =false;
        }else {
            for (int i = 2; i < sayi; i++) {
                if(sayi%i == 0) {
                    asal =false;
                    break; // asal olmadigi kesinlesti
                }

            }
        }
if(asal) {
    System.out.println("asal sayidir = " + sayi);
}else {
    System.out.println(sayi + " asal degildir");
}
    }
}
