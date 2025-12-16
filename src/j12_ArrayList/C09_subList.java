package j12_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C09_subList {
    public static void main(String[] args) {
        //sublist() -> listini istenen list parcasını(şu index'ten şu index'e parcasını) return eder

        ArrayList<String> ulkeList =new ArrayList<>(Arrays.asList("almanya" , "Cuba", "Ingiltere"));
        System.out.println("SubList oncesi = " + ulkeList);
        System.out.println("ulkeList.subList(1,2) = " + ulkeList.subList(1, 2)); // [Cuba] 1 dahil 2 dahil degil
        System.out.println("ulkeList sublist sonrasi = " + ulkeList); // [almanya, Cuba, Ingiltere]



        ArrayList<String>  hello = new ArrayList<>(ulkeList.subList(1,2)); // bos listeyi baska bir listeye atadik
        System.out.println("hello = " + hello); // Cuba
    }
}
