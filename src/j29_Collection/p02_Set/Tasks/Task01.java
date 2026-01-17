package j29_Collection.p02_Set.Tasks;

import java.util.*;

public class Task01 {
    public static void main(String[] args) {
       /* Task->
         Deger ataması yapılan Array'i arraylist'e ceviren method create ediniz
         main içersinde meth return ettiği arryList'i hashSet, linkedHashSet ve TreeSett'e atayınız.
         */
        String arr[] = {"javaCAN", "javaSU", "javaNAZ", "javIYE", "javIDAN", "javaTAR", "javFER"};

        // Method cagrisi =>

            ArrayList<String> newArr=arrayToArrayList(arr);


//Array list set donusumleri =>
        HashSet<String> hash=new HashSet<>(newArr);
        LinkedHashSet<String> linkedHash=new LinkedHashSet<>(newArr);
        TreeSet<String> threeSet=new TreeSet<>(newArr);

        System.out.println("hash = " + hash);
        System.out.println("newArr = " + newArr);
        System.out.println("linkedHash = " + linkedHash);
        System.out.println("threeSet = " + threeSet);




    }//main sonu
    //Array => Array Liste cevir
    private static ArrayList<String> arrayToArrayList(String[] arr) {
        return new ArrayList<>(Arrays.asList(arr)); // Arrayi liste cevirir.
    }


}
