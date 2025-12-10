package j12_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C07_contains {
    public static void main(String[] args) {
        //contains()-> list'te istenen elamnın varlığını control eder true/false return eder
        ArrayList<String> ulkeList =new ArrayList<>(Arrays.asList("almanya" , "Cuba", "Ingiltere"));
        System.out.println("ulkeList.contains(\"kolonya\") = " + ulkeList.contains("kolonya")); // false
    }
}
