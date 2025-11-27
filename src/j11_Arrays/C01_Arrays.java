package j11_Arrays;

import java.util.Arrays;

public class C01_Arrays {
    public static void main(String[] args) {
            /*
        Array (Dizi): Java'da birden fazla aynı type variable depolamak (store etmek) icin kullanilan bir objedir.

        Array tanımlamak için:
        1- data type (Bir array'in icerisinde sadece ayni data tipinden variable olmalıdır.)
        2- length (length array'e depolanacak  max eleman sayisini belirtir ve length'den  fazla eleman  koyulursa RTE verir)

         Array'de primitive datalar veya non-primitive datalarin referanslari store edilebilir
         isimler array'inin icinde isim degerleri degil, isimlerin referanslari saklanır.

         */

        //Array declaration

 int a; //declere edilmis ama assignment edilmemit primitive data
int [] arr; // declare edilmis ama assignment edilmemis non-primitive int data type array
// Trick => declare edilmis ama assignment edilmemeis array herhangi bir actiona a alinirsa CTE verir.

        String isimArr[]= {"imren", "haluk", "tulin", "erdem", "hidayet", "ali haydar", "mehmet"};
        int sayiArr1[]=new int[5]; //eleman sayisi 5 declare edilen bos int data type array
        int sayiArr2[]=new int[7]; // eleman sayisi 7 decalre edilen bos int data type array


        // Array'e eleman girişi->update

sayiArr1[0]=20; //1. eleman
sayiArr1[2]=31;  // 3. eleman
sayiArr1[1]=35; // 2. eleman
sayiArr1[3]=34; // 4. eleman
sayiArr1[1]= 28; // 2. elaman 35 olan deger 28 olarak update edildi.
        // Array elemanlari benzersiz olmak zorunda degildir.

        // Array eleman  sayısı-> length

        //Array print etme...


        // Array son index eleman  -> arr[arr.length-1]

        // Array ilk index eleman -> arr[0]


        // Array olmayan index eleman



        // Array elemanları print etme -> bad practice



        //Arrays elaman natural ordering(doğal sırlamaa->alphabetic a-z n numerik ascending k-b)
     }
}
