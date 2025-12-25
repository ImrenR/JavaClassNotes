package j11_Arrays.Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class _12_Array_no14 {

    public static void main(String[] args) {

        /*
        int array oluşturun (intArr)
        Eğer 1 " ve" 4 elemanlarına aynı anda sahip değilse true dönsün.
        Eğer 1 ve 4 elemanlarına aynı anda sahipse false dönsün.

        no14([1, 2, 3]) → true
        no14([1, 2, 3, 4]) → false
        no14([2, 3, 4]) → true

        bir array oluşturun ve elemanları : 1,2,3,4
        Sonuç false olmalı
        NOT: Array elemanlarını 1,2,3 olarak değiştirirseniz sonuç doğru olmalı
         */

        // code start here

       int [] arr = {1,2,3,4};
       boolean birVar = false;
       boolean dortVar = false;


        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 1)
                birVar =true;
             if(arr[i] ==4)
                 dortVar =true;


        }
        boolean sonuc = !(birVar && dortVar);
        System.out.println(sonuc);


        //Kod buradan başlıyor.. Yukarısını değiştirmeyiniz..
        // intArr ı kullanın.


    }
}