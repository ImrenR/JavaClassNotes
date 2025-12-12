package j11_Arrays;

import java.util.Arrays;

public class C03_Arrays_binarySearch {
    public static void main(String[] args) {
        // Arrays.binarySearch(arr,value);-> girilen arraydeki istenen eleman kontrolu

        int sayiArr[] ={23,44,2,11,55,60,32,34,59,22,9,64,43};

        int sayi1 =44;
        System.out.println("*** Amela code :( ****");

        boolean flag=false; // bayrak asagi

        for (int i = 0; i < sayiArr.length; i++) {
            if (sayiArr[i] == sayi1) {
                flag = true; // sarti saglayan case olusturuldugunda flag yukari
                break;
            }
        }
        System.out.println(flag?"aranan sayi arrayde mevcut" : "aranan sayi mevcut degil");
       Arrays.sort(sayiArr); // siralama yapmazsan binarysearch calismaz
        System.out.println("Arr de 44 var mi:" + Arrays.binarySearch(sayiArr,44));

    }
}
