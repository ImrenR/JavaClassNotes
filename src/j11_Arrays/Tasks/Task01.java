package j11_Arrays.Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        //Task-> girilen bir int array elemanlarını buyukten kucuge   print eden code create ediniz.


        int []arr = {2,45,56,34,67};

     Arrays.sort(arr);  // kucukten buyuge siraladik

        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print(arr[i] + " ");
        }


    }

}
