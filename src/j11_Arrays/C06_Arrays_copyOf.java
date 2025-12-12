package j11_Arrays;

import java.util.Arrays;

public class C06_Arrays_copyOf {

    public static void main(String[] args) {
        // Arrays.copyOf(arr,int);-> girilen arr'yin istenen elelman sayısı kadar ilk elemanı kopyalar
        int arr[] = {2, 5, 13, 65, 49, 38, 33, 58, 27};

        // arr'in son 3 elamanını store(depolayan) arrayi print eden code create ediniz...
          int yeniArr [] = Arrays.copyOf(arr,6);
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr)); // [2, 5, 13, 65, 49, 38, 33, 58, 27]
        System.out.println("Arrays.toString(yeniArr) = " + Arrays.toString(yeniArr)); //[2, 5, 13, 65, 49, 38]



        // Array'i belirli bir eleman ile set-update (fill(value)) etme

        System.out.println("Fill oncesi = " + Arrays.toString(arr));
        Arrays.fill(arr,99);
        System.out.println("Fill sonrasi = " + Arrays.toString(arr)); // butun array eleman sayisi kadar 99 olur


        // task-> arr 3 ile 7 index arası(4-5-6) elamanları 35 ile update eden code create ediniz...

Arrays.fill(arr,4,7,39);
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
    }
}
