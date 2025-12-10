package j12_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C05_size {
    public static void main(String[] args) {
        //size()-> listin eleman sayısını return eder.(arr->length)



        ArrayList<String> ulkeList =new ArrayList<>(Arrays.asList("almanya" , "Cuba", "Ingiltere"));
        System.out.println(ulkeList.size());

    }
}
