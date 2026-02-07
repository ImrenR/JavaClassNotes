package j12_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task05 {
    public static void main(String[] args) {


         /*TASK :
        2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tüm elemanları bir
        listeye kopyalayan ve harf sırasına göre yazdıran bir METHOD yazınız.
        Ex : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
           Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]
         */
        String isimArr[][] = {
                {"Ali", "Veli", "Ayse" },
                {"Hasan", "Can" }, 
                {"Suzan" }
        };
        ///  1. Cozum =>
       List<String> sonuc = arrayiListeCevirVeSirala(isimArr);
        System.out.println("sonuc = " + sonuc);
    }//main sonu

    private static List<String> arrayiListeCevirVeSirala(String[][] isimArr) {
        List<String> list = new ArrayList<>();

        // 2 boyutlu array dolasma
        for (int i = 0; i < isimArr.length; i++) {
            for (int j = 0; j <isimArr[i].length ; j++) {
                list.add(isimArr[i][j]);

            }

        }
        Collections.sort(list);
        return list;
    }


}
