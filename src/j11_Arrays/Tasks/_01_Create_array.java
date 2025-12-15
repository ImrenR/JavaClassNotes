package j11_Arrays.Tasks;

import java.util.Arrays;

public class _01_Create_array {

    public static void main(String[] args) {
        /*
        String Array (Dizi) oluşturunuz.
        elemanları : Apple, Orange , Banana, Kiwi
        Array'leri tüm elemanları yazdırınız.
         */

        //Kodu aşağıya yazınız.
        String[] fruits = {"Apple", "Orange", "Banana", "Kiwi"};

// 1. yontem :

        //  System.out.println(Arrays.toString(fruits));


        //2. yontem : for dongusu

        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);


        }

    }
}