package j11_Arrays;

import java.util.Arrays;

public class C07_MdArrays {
    public static void main(String[] args) {
    /*
		Çok Boyutlu Diziler
        Java'da Çok Boyutlu Diziler varsayılan bir veri tipi olarak bulunmazlar ve matris olarak adlandırılırlar.
         Dizilerin 2 boyutlu halleri şeklinde tanımlanırlar.

          Matrisler satır ve sütun şeklinde tablo verisi formatındaki verileri tutmak için kullanılır.

          Diziler liste halinde veriler için uygunken, matrisler tablo şeklindeki veriler için uygundur.

           Oluşturulan tabloda bir değere ulaşmak istersek satır ve sütun sayısını girmemiz yeterli olacaktır.

        * TRICK :)İki boyutlu dizilerde tek boyutlu diziler gibi indis değeri 0'dan başlar.

        Dizide tutulacak veri tipleri aynı olmak zorundadır farklı veri tiplerini aynı matriste tutamayız.

		 * 1- Ic Icice olusturulan  array'lerde   disardaki ana array'e outer-> Kat  array
		 *  icerdeki  array'lere  inner->Daire array denir

		 * 2- TRICK->  icerdeki array'lerin boyutlari birbirinden farkli ise
		 *  Array'i ancak tum elemenlari atanarak declare edilmeli

		 * 3- Multi dimensional array'de bir elemanin indexi icin
		 *  en distaki array haric, elemana kadar ic ice olan tum arraylerin indexlerini yazmak gerekir
		 */



        // MdArrays declaration...

        // minicik taskcıkkk-> bir okul için 7 sınıfı ve 24 er öğrencisi olan bir arra tanımlanyın...

               int arr1[][] = new int [7][24]; // 7. sinfin 24. ogrencisi gibi
                // 7 kat her katta 24 dairelik bos iki boyutlu apartman tanimlandi

        //MdArray eleman atama


        arr1[2][23] = 31;
        arr1[1][0]= 35;
      //  arr1[10][2]= 25; // RTE
        //  bunlari nerede kullanacagim -> mesela bir satis app dusunelim :
        //  her musteriye id verildi, 2 numarali id nin 23 siparisi var
        // ya da il ilce girildi, 2. ildeki 23 nolu musteri, 1. ildeki 0 nolu musterimiz


        // MdArray print etme

        System.out.println("arr1[2][23] = " + arr1[2][23]);


        int arr2[][]= {
                {12,15},   // 0. kat 2 daireli
                {123,354,567}, // 1. kat 3 daireli
                {1001}, // 2. kat 1 daireli
        };
        System.out.println("Arrays.toString(arr2) = " + Arrays.toString(arr2)); // referanslarini verir array vermez
        System.out.println("Arrays.deepToString(arr2) = " + Arrays.deepToString(arr2)); //[[12,15],[123,354,567], ...
 // cok boyutlu oldugu icin deepToString metodunu kullanmamiz lazim, birden cok array varsa
    }
}
