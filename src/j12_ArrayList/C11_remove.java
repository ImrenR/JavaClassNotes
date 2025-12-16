package j12_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C11_remove {
    public static void main(String[] args) {
        //remove()-> list'te istenen elemanı siler

        ArrayList<String> ulkeList =new ArrayList<>(Arrays.asList("almanya" , "Cuba", "Ingiltere"));
        System.out.println("Remove oncesi ulkeList = " + ulkeList);
        System.out.println("ulkeList.remove(2) = " + ulkeList.remove(2)); // Ingiltere
        System.out.println("ulkeList.remove(\"Tanzanya\") = " + ulkeList.remove("Tanzanya")); //false
       // System.out.println("ulkeList.remove(5) = " + ulkeList.remove(5)); // error verir cunku listede 5 adet eleman yoktur
        System.out.println("ulkeList.remove(\"Cuba\") = " + ulkeList.remove("Cuba")); // true
        System.out.println("Remove sonrasi ulkeList = " + ulkeList);

        // cikarilmis listeyi verir bastaki liste gelmez.

    // removeAll()
        ArrayList<String> sehirList =new ArrayList<>(Arrays.asList("hatay" , "izmir", "ankara", "istanbul", "adana"));
       ulkeList.addAll(sehirList);
        System.out.println("ulkeList = " + ulkeList); // sehirlist sona eklendi
        System.out.println("ulkeList.removeAll() = " + ulkeList.removeAll(sehirList)); // true
        System.out.println("ulkeList = " + ulkeList); // silindi cikti : [almanya}

    }
}
