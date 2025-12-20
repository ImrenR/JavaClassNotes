package j14_Varargs;

public class C02_Varargs_Array {

    public static void main(String[] args) {

        int arr[] = {10, 11, 36, 14, 41, 77, 46, 61, 20};

        // task01-> verilen arr elamanlarını toplamını print eden METHOD create ediniz.

        System.out.println("arrTopla(arr) = " + arrTopla(arr));

        System.out.println("varargsTopla(10, 11, 36, 14, 41, 77, 46, 61, 20) = " + varargsTopla(10, 11, 36, 14, 41, 77, 46, 61, 20));


        // task02-> task01 execute(run) eden varargs  METHOD create ediniz.
// ahan da Trick köşesinde böyün -> varargs methoda girilen value'ler array elamanı olarak derlendiği için array parametre de alır...

    }// main sonu

    private static int varargsTopla(int...a){
     int toplam=0;
     for(int avuc : a){
         toplam +=avuc;
     }


        return toplam;
        }



    private static int arrTopla(int[] a) {


       int toplam=0;
        for (int i = 0; i <a.length ; i++) {
            toplam +=a[i];
        }
        return toplam;
    }


}// Class son u
