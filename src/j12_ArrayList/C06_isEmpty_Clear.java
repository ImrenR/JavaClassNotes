package j12_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C06_isEmpty_Clear {
    public static void main(String[] args) {
        //isEmpty()-> listin boş olmasını kontrol eder true/false return eder
        ArrayList<String> ulkeList =new ArrayList<>(Arrays.asList("almanya" , "Cuba", "Ingiltere"));
        ArrayList<String> sehirList =new ArrayList<>();

        System.out.println("ulkeList.isEmpty() = " + ulkeList.isEmpty()); //false
        System.out.println("sehirList.isEmpty() = " + sehirList.isEmpty()); // true


        //clear()-> listin tum elemanlarını silip boşaltır...
        System.out.println("ulkeList.size() = " + ulkeList.size());
       ulkeList.clear(); // list bosaltildi // sout olmaz burada
        System.out.println("ulkeList.size() = " + ulkeList.size()); // 0

    }
}
