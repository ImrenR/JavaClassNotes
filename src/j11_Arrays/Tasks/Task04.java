package j11_Arrays.Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        // task-> girilen bir int array elamanlarından  ortalamadan buyuk olan eleman sayısını print eden code create ediniz


        Scanner input = new Scanner(System.in);
        System.out.println("bir array giriniz");
        int boyut =input.nextInt(); // kac elemanli bir array olacagina karar verelim


       int [] arr = new int[boyut]; // bu eleman sayisini yeni bir arraye yerlestiririz


       // Array elemanlarini al
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[ " + i + "]=");
            arr[i]=input.nextInt();
        }

        // ortalam hesaplayalim
int toplam=0;
        for (int i = 0; i <arr.length ; i++) {
            toplam+=arr[i];
        }
       double ortalama = toplam / arr.length;
        System.out.println("ortalama = " + ortalama);

        // ortalamadan buyuk eleman sayisini bul
int b=0;
        for (int i = 0; i < arr.length; i++) {
                if(arr[i]>ortalama){
                    b++; // sayiyor toplamiyor
                }
        }

        System.out.println("b = " + b);


    }


}
