package j12_ArrayList.Tasks;

public class _11_prime_numbers {

    /*
    negatif olmayan bir n sayısı girin ve bu sayıya kadar olan kaç asal sayı var ise yazdırın.

        Örnek 1:
        n = 20

        cevap: 8      ==   (2,3,5,7,11,13,17,19)  20 ye kadar 8 adet asal sayı vardır.
        Örnek2:
        Input(Girdi): 10
        Output(Çıktı): 4
        Explanation(Açıklama): 10'dan küçük 4 adet asal sayı vardır. (2,3,5,7)
     */

    public static void main(String[] args) {
int n= 20;
int count =0;

        for (int i = 2; i <=n; i++) {
            if(isPrime(i)) {
                count ++;
            }
        }
        System.out.println(count); // 20 icin = 8
    }

    private static boolean isPrime(int num) {
        if (num <2)
            return false; // 0 ve 1 asal degil
        for (int i = 0; i < Math.sqrt(num) ; i++) {
            if(num%i == 0) {
                return  false; // bolunuyorsa asal degil
            }
        }
    return true;

    }
}



