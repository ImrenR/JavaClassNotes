package j29_Collection.p02_Set.Tasks;

import java.util.*;

public class Task01 {
    public static void main(String[] args) {
       /* Task->
         Deger ataması yapılan Array'i arraylist'e ceviren method create ediniz
         main içerisinde meth return ettiği arryList'i
          hashSet,
           linkedHashSet ve
           TreeSett'e atayınız.
         */

        String arr[] = {"javaCAN", "javaSU", "javaNAZ", "javIYE", "javIDAN", "javaTAR", "javFER"};

        // Method cagrisi =>
       ArrayList<String> newArr= arrayToList(arr);

      HashSet<String> hashSet = new HashSet<>(newArr);
      LinkedList<String> linkedList=new LinkedList<>(newArr);
      TreeSet<String> treeSet=new TreeSet<>(newArr);

        System.out.println("newArr = " + newArr); //[javaCAN, javaSU, javaNAZ, javIYE, javIDAN, javaTAR, javFER]
        System.out.println("hashSet = " + hashSet); //[javaNAZ, javaTAR, javaCAN, javIYE, javaSU, javFER, javIDAN]
        System.out.println("linkedList = " + linkedList);// [javaCAN, javaSU, javaNAZ, javIYE, javIDAN, javaTAR, javFER]
        System.out.println("treeSet = " + treeSet);// [javFER, javIDAN, javIYE, javaCAN, javaNAZ, javaSU, javaTAR]
 // IMPORTANT NOTES
        // 1- Array lst = Sirali , tekrar olabilir
        // 2- HashSet   = Sira yok , tekrar YOK =>> EN HIZLI
        // 3- LinkedHashSet= Ekleme sirasini korur, tekrar yok.
        //4- TreeSet =    ALfabetik siralar, tekrar yok, elamanlar comparable olmali ( Neden yavas, cunku her eklemede siralama yapar)

    }

    private static ArrayList<String> arrayToList(String[] arr) {
return new ArrayList<>(Arrays.asList(arr)); // array i liste ceviren Arrays.asList tir
    }


}
