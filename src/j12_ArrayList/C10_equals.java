package j12_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C10_equals {
    public static void main(String[] args) {
        //equals()-> iki listin hem index hem de value (değer) eşitliğini kontrol eder
        // true/false return eder
        ArrayList<String> ulkeList1 =new ArrayList<>(Arrays.asList("almanya" , "Cuba", "Ingiltere", "Portekiz"));
        ArrayList<String> ulkeList2 =new ArrayList<>(Arrays.asList("Cuba","almanya" ,"Portekiz" ,"Ingiltere"));
        ArrayList<String> ulkeList3 =new ArrayList<>(Arrays.asList("almanya" , "Cuba", "Ingiltere", "Portekiz"));



    }
}
