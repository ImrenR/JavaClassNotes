package j11_Arrays.Tasks;

import java.util.Arrays;

public class _07_array_max_value {

    public static void main(String[] args) {

        /*
            int Array oluşturun ve elemanları : 12,2,5,15,8
            En büyük değeri yazdırınız.
         */

        // code start here

int[] sayi = {12,2,5,15,8};
int max =sayi[0];

        for (int i = 0; i < sayi.length; i++) {
            if (sayi[i]> max){
                max = sayi[i];
            }
        }
        System.out.println(max);
    }
}

