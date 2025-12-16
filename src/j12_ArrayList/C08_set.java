package j12_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C08_set {
    public static void main(String[] args) {
        //set()-> listin istenen index'e istenen elemanını  update set eder-> şu indexin şu elelmanını şununla değiştir...

        ArrayList<String> ulkeList =new ArrayList<>(Arrays.asList("almanya" , "Cuba", "Ingiltere"));

        System.out.println("Set oncesi ulkeList = " + ulkeList); //  [almanya, Cuba, Ingiltere]

        System.out.println("ulkeList = " + ulkeList.set(1, "Tanzanya")); // degistirecegi elemanin ciktisini verir : Cuba

        System.out.println("ulkeList set sonrasi= " + ulkeList); // [almanya, Tanzanya, Ingiltere]
    }
}
