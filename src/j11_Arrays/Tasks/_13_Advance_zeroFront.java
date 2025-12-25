package j11_Arrays.Tasks;

import java.util.Arrays;

public class _13_Advance_zeroFront {

    public static void main(String[] args) {

      /*

   Verilen Array tam olarak aynı sayıları içeren, ancak tüm sıfırların dizinin başında gruplandırılması
   için yeniden düzenlenmiş bir Array döndürün.
   Sıfır olmayan sayıların sırası önemli değildir.
   Böylece {1, 0, 0, 1} {0, 0, 1, 1} olur. Verilen diziyi değiştirebilir ve
   döndürebilir veya yeni bir dizi oluşturabilirsiniz.

   Bu şekilde bir Array oluşturunuz: 1,0,0,1,0
   Sonuç böyle olmalı :  0,0,0,1,1

       */

        // Kodu aşağıya yazınız..
 int arr[]= {1,0,0,1,0};

     int [] yeniArr = new int[arr.length];

     int index = 0;

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] == 0){
                yeniArr[index]=0;
                index++;
            }

        }

        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] != 0){
                yeniArr[index]=arr[i];
                index++;
            }

        }
        System.out.println("Arrays.toString(yeniArr) = " + Arrays.toString(yeniArr));


    }
}