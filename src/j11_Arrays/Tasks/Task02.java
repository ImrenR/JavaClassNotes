package j11_Arrays.Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        //task-> girilen int array elemanları toplamını print eden code create ediniz.

int [] arr = {2,4,6,5,89};

        int toplam = 0; // disarda tanimlanmali..

        for (int i = 0; i < arr.length; i++) {

           toplam+=arr[i];


        }
        System.out.println("toplam = " + toplam); // for dongusu doner ve bitince toplami buraya bastirir
    }
}
