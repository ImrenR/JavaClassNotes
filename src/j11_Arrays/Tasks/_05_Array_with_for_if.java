package j11_Arrays.Tasks;

public class _05_Array_with_for_if {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 5,6,8,12,14,19
        Eğer sayı çiftse topla, tekse çıkar.
        Örneğin:
         -5 + 6 + 8 + 12 + 14 - 19 = 16
        Toplamlarını yazdırın.
         */

        //Kodu aşağıya yazınız.

int[] sayilar = {5,6,8,12,14,19};

int toplam =0;
        for (int i = 0; i < sayilar.length; i++) {
            if(sayilar[i]%2 == 0){
                toplam += sayilar[i];

            } else if (sayilar[i]%2==1) {
                toplam -= sayilar[i];

            }else System.out.println("hatali");
        }
       System.out.println("toplam = " + toplam); // sonuc 16 dir


    }
}
