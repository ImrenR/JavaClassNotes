package j12_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C04_get {
    public static void main(String[] args) {
        //get()-> listte girilen index'deki elemanı return eder. olmayan index için RTE exc. fırlatır


        ArrayList<String> ulkeList =new ArrayList<>(Arrays.asList("almanya" , "Cuba", "Ingiltere"));
        System.out.println("ulkeList.get(3) = " + ulkeList.get(2));
        // System.out.println(ulkeList.get(8)); // eror verir cunku array de 8 adet eleman yok
    }
}
