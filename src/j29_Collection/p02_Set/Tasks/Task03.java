package j29_Collection.p02_Set.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Task03 {
    public static void main(String[] args) {
    /*
         Task->
    commonValues() isminde bir method oluşturun ve parametresi  2 tane hashset olmalı.
    return tipi arraylist olmalı.
    ÖRNEĞİN:
    İlk Hashset : "Germany" , "England" , "South Africa" , "Brazil" , "USA"
    İkinci  hashset  : "Germany" , "China" , "Brazil" , "France" ,  "USA"
    Ortak değerleri ArrayListe ekleyiniz.
    çıktı:  "Germany" , "Brazil" ,"USA"
    ArrayListi print eden method create ediniz.
     */

        HashSet<String> hash1= new HashSet<>(Arrays.asList("Germany","England","South Africa" , "Brazil" , "USA"));
        HashSet<String> hash2= new HashSet<>(Arrays.asList("Germany" , "China" , "Brazil" , "France" ,  "USA"));

         ArrayList<String> newArr = ortakElemanlar(hash1,hash2);
         arrayListiYazdir(newArr);
    }//main sonu

    private static void arrayListiYazdir(ArrayList<String> newArr) {
        System.out.println(newArr); //[USA,Brasil,Germany]
    }

    private static ArrayList<String> ortakElemanlar(HashSet<String> hash1, HashSet<String> hash2) {
HashSet<String> ortakSet = new HashSet<>(hash1); // hash1 in kopyasini aliriz seti bozmak istemiyoruz cunku
        ortakSet.retainAll(hash2); // ortak degerler

        //=. set to arraylist
        return new ArrayList<>(ortakSet);
    }


}



