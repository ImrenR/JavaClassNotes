package j29_Collection.p02_Set.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Task03 {
    public static void main(String[] args) {
    /*
         Task->
    commonValues() isminde bir method oluşturun ve parametresi  2 tane hashset olmalı.
    return tipi arraylist olmalı.
    ÖRNEĞİN:
    İlk Hashset : "Germany" , "England" , "South Africa" , "Brazil" , "USA"
    İkinci  hashset  : "Germany" , "China" , "Brazil" , "France" ,  "USA"
    Ortak değerleri ArrayListe ekleyiniz.
    çıktı:  "Germany" , "Brazil" ,"USA"
    ArrayListi print eden method create ediniz.
     */
        HashSet<String> hash1=new HashSet<>();
hash1.add("Germany");
        hash1.add("England");
        hash1.add("South Africa");
        hash1.add("Brasil");
        hash1.add("USA");

        HashSet<String> hash2=new HashSet<>();
        hash2.add("Germany");
        hash2.add("China");
        hash2.add("Brasil");
        hash2.add("France");
        hash2.add("USA");

     ArrayList<String>ortaklar=commonValues(hash1,hash2);
printArrayList(ortaklar);

    }//main sonu

    private static void printArrayList(ArrayList<String> ortaklar) {
        System.out.println("ortaklar = " + ortaklar);
    }

    private static ArrayList<String> commonValues(HashSet<String> hash1, HashSet<String> hash2) {
        ArrayList<String> ortakListe=new ArrayList<>();

            for (String each: hash1) {
                if(hash2.contains(each)){
                    ortakListe.add(each);
                }


        }
            return ortakListe;
    }


}
// CIKTI => ortaklar = [Brasil, USA, Germany]