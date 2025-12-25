package j11_Arrays.Tasks;

public class _08_array_min_value {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 14 , 19 , 5 , 21
        En küçük (minimum) sayıyı yazdırınız.
         */

        // Kodu aşağıya yazınız..
int[]sayilar = {14,19,5,21};

int minSayi =sayilar[0];


        for (int i = 0; i <sayilar.length ; i++) {
            if (sayilar[i] < minSayi){
               minSayi=sayilar[i];
            }
        }
        System.out.println("En kucuk sayi =" + minSayi); // 5
    }
}

