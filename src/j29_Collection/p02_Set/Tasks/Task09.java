package j29_Collection.p02_Set.Tasks;

import j102_OCA.Q041.A;

import java.util.*;

public class Task09 {
    /* TASK:

        1.  30 elemanli, elemanlari 0-10 arasinda random sayilardan olusan bir arraylist create edin.
        2.  1. adımdaki arraylist print edin.
        3.  bu arrayin tekrar eden elemanlarini arrayden silen methodu create edin.
        4.  sonucu print edin
        5.  Basta hazirlanan arraylist'i Set'e cevirin
        6.  Hazirlanan bu Set'i de Arraylist'e cevirin

     */

    public static void main(String[] args) {

    ArrayList<Integer> list = new ArrayList<>();
    Random rnd=new Random();
        for (int i = 0; i < 30; i++) {
            list.add(rnd.nextInt(11)); // 0-10 dahil
            
        }
        System.out.println("list = " + list);
        
        ArrayList<Integer> uniqueList = removeDuplicateWithSet(list);
        System.out.println("uniqueList = " + uniqueList);
    }

    private static ArrayList<Integer> removeDuplicateWithSet(ArrayList<Integer> list) {
   Set<Integer>set=new HashSet<>(list); // duplicati otomatik oalrak sil
   return new ArrayList<>(set); // tekrar attay liset cevirdik

    }


}


