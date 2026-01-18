package j29_Collection.p02_Set.Tasks;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Task07 {

    /*
    removing() isminde bir method oluşturun.
    Parametre olarak bir LinkedHashset ve iki String ten oluşmalı.
    Eğer Stringler LinkedHashset 'in içinde varsa, sil.
    Return tipi linkedhashset
    Örneğin,
    linkedhashset : Germany , France , USA , Canada , Mexico , Brazil
    String 1= Germany
    String 2 = USA
     Germany ve USA 'i sil.
    Set'i döndür.
     */

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("Germany","France","USA","Canada","Mexico","Brazil"));

        String str1= "Germany";
        String str2= "USA";

        linkedList=removing(linkedList,str2,str1);
        System.out.println("linkedList = " + linkedList); // linkedList = [France, Canada, Mexico, Brazil]

    }

    private static LinkedList<String> removing(LinkedList<String> linkedList, String str2, String str1) {
   if (linkedList.contains(str1) || linkedList.contains(str2)){
       linkedList.remove(str1);
       linkedList.remove(str2);

   }
   return linkedList;
    }
}