package j12_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C03_indexOf {
    public static void main(String[] args) {
        //indexOf()-> list içinde istenen eleman var ise index'ini return eder 
        // olmayan eleman için -1 return eder.
        
        
        
        ArrayList<String> ulkeList =new ArrayList<>(Arrays.asList("almanya" , "Cuba", "Ingiltere"));
        System.out.println("ulkeList.indexOf(\"Almanya\") = " + ulkeList.indexOf("Almanya"));

        System.out.println("ulkeList.indexOf(\"almanya\") = " + ulkeList.indexOf("almanya"));
        ulkeList.add(2, "Polkonyak");
        System.out.println("ulkeList.lastIndexOf(\"Polkonyak\") = " + ulkeList.lastIndexOf("Polkonyak"));

    }
}
