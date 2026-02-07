package j14_Varargs;

public class Task04 {
    public static void main(String[] args) {
        /* Task->
    stringlerin istenilen kadar ilk harflerini yazdıran METHOD create ediniz.
*/
        String strArr1[] = {"h", "a", "l", "u", "k"};
        String strArr2[] = {"a", "l", "i"};
        int sayi = 3;


        ilkHarfleriYazdir(sayi,strArr1,strArr2);
    }

    private static void ilkHarfleriYazdir(int sayi, String[]... stringDizileri) {

        for (String[] dizi : stringDizileri) {
            System.out.print("[");
            for (int i = 0; i < sayi && i < dizi.length; i++) {
                System.out.print( dizi[i]);

            }
            System.out.print("]");
        }
    }
}
