package j11_Arrays.Tasks;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        // Task -> Girilen 5 sayıyı ,
        // giriş sırasına göre tersten print eden code create ediniz

Scanner input = new Scanner(System.in);
        System.out.println("5 adet sayi giriniz : ");
        int sayi1=input.nextInt();
        int sayi2=input.nextInt();
        int sayi3=input.nextInt();
        int sayi4=input.nextInt();
        int sayi5=input.nextInt();

     int [] arr = {sayi1,sayi2,sayi3,sayi4,sayi5};

        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
