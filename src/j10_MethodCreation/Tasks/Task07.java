package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task07 {
    static Scanner input = new Scanner(System.in);//gunes eyledim ki herkeşler erişebile

    public static void main(String[] args) {
        //Task-> Girilen 3  sayıdan en küçüğünü print eden METHOD  create ediniz

        System.out.println("Sayi1 yi giriniz :");
        int sayi1 = input.nextInt();
        System.out.println("Sayi2 yi giriniz :");
        int sayi2= input.nextInt();
        System.out.println("Sayi3 yi giriniz :");
        int sayi3= input.nextInt();

        int minSayi=0;
        System.out.println("MaxSayi = " + kiyaslA(sayi1, sayi2, sayi3, minSayi));

    }//main sonu

    private static int kiyaslA(int sayi1,int sayi2, int sayi3, int minSayi) {
        if (sayi1 < sayi2 && sayi1 <sayi3) {
            minSayi += sayi1;
        } else if (sayi2<sayi1 && sayi2<sayi3) {
            minSayi +=sayi2;
        }else System.out.println("Max sayi sayi 3 tur");
        return minSayi;
    }


}//Class sonu
