package j14_Varargs;

public class Task02 {
    public static void main(String[] args) {
         /*
        Task -> Girilen ilk sayı hariç diğerlerini toplayan ve toplam ile ilk sayıyı çarpan METHOD create ediniz.
         */
         int sayiArr[] = {2,24, 23, 38, 33, 21, 59, 26, 10};

        System.out.println("carpTopla(sayiArr) = " + carpTopla(sayiArr));
    }//main sonu

    public static int carpTopla(int[] arr){

        int toplam =0;
        int ilkSayi = arr[0];

        for (int w : arr){
            toplam+=w;
        }
        return toplam*ilkSayi ;
    }

}
