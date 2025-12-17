package j12_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class C12_replaceAll_fill {
    public static void main(String[] args) {
        //replaceAll();-> List'te belirli bir elemanı belirli bir elemana update eder.treu/ false return eder


        ArrayList<String> ulkeList =new ArrayList<>(Arrays.asList("almanya" , "Cuba", "Ingiltere"));
        System.out.println("replaceAll oncesi = " + ulkeList);
        System.out.println("replaceAll yapildiktan sonra= " + Collections.replaceAll(ulkeList, "almanya", "Sacmalamanca"));
        System.out.println("replaceAll sonrasi= " + ulkeList);

        //fill()-> list'tin tum elemanlarını istenen değere update eder...

        Collections.fill(ulkeList, "JavaCan"); // sout olmaz void cunku
        System.out.println("Fill sonrasi ulkeList = " + ulkeList);

    }
}
