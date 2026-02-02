package j12_ArrayList.Tasks;

import java.util.*;

public class _03_arraylist3 {

    /*
        getLength() isminde bir method oluşturun.
        Parametre olarak String ArrayList
        Return tipi Integer ArrayList
        ArrayList içindeki her bir Stringin uzunluğunu bulunuz.

        Tüm elementlerin uzunluğunu döndürün

        Örneğin;
        ArrayList  :  "New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"
        Tüm Stringlerin uzunluklarını yazdırın;
        cevap: 10 ,  8 , 4 , 7 , 6 olmalı
     */

    public static void main(String[] args) {
List<String> arr= new ArrayList<>(Arrays.asList("New jersey", "New york", "Ohio", "Florida", "Boston"));
List<Integer> result = getLength(arr);
        System.out.println("result = " + result);

    }

    private static List<Integer> getLength(List<String> arr) {
        List<Integer>lengths = new ArrayList<>();
        for(String str:arr){
            lengths.add(str.length()); // her stringin uzunlugunu al
        }
        return lengths;
    }


}
