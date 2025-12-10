package j12_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C11_remove {
    public static void main(String[] args) {
        //remove()-> list'te istenen elemanı siler

        ArrayList<String> ulkeList =new ArrayList<>(Arrays.asList("almanya" , "Cuba", "Ingiltere"));
        System.out.println("Remove oncesi ulkeList = " + ulkeList);
        System.out.println("ulkeList.remove(2) = " + ulkeList.remove(2));
        System.out.println("ulkeList.remove(\"Tanzanya\") = " + ulkeList.remove("Tanzanya"));
       // System.out.println("ulkeList.remove(5) = " + ulkeList.remove(5)); // error verir cunku listede 5 adet eleman yoktur
        System.out.println("ulkeList.remove(\"Cuba\") = " + ulkeList.remove("Cuba"));
        System.out.println("Remove sonrasi ulkeList = " + ulkeList); // cikarilmis listeyi verir bastaki liste gelmez.

    // removeAll()

    }
}
