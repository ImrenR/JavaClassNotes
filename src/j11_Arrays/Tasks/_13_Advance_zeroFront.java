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
 int n = arr.length;
 int result []= new int [n]; // arr eleman sayisi kadar result arrayini doldurduk.

        int index =0;

        // sifirlari basa yerlestir
        for (int i = 0; i < n; i++) {
            if(arr[i] == 0){
                result[index]=0; //
                index++;
            }

        }

// sifir olmayanlari doldur
        for (int i = 0; i <n ; i++) {
            if (arr[i] != 0){ // arr in 0 a esit olmayan lemanlari
                result[index]=arr[i]; // result in 0 indexinden sonuna kadar arr in ilk indeksinden sonuna kadar 0 olmayanlari ata
                index++;
            }

        }
        System.out.println(Arrays.toString(result));
    }
}