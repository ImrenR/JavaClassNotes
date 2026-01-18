package j29_Collection.p02_Set.Tasks;

import java.util.Arrays;
import java.util.HashSet;

public class Task05 {

    /*
    changeSet() isminde bir method oluşturun.
    Parametre olarak bir String HashSet   ve  iki String
    return hashset olmalı
    Eğer HashSet String 1 e sahipse, String 1 ile String 2 yi değiştirin.

    ÖRNEK:
    hashset = "banana" , "strawberry" , "kiwi" , "pineapple"
    String 1 = banana
    String 2 = peach
    CEVAP: "peach" , "strawberry" , "kiwi" , "pineapple"
     */

    public static void main(String[] args) {
String str1= "banana";
String str2="peach";

HashSet<String> hashSet= new HashSet<>(Arrays.asList("banana","strawberry","kiwi","pineapple"));


hashSet = changeSet(hashSet,str2,str1);
        System.out.println("hashSet = " + hashSet);
        // CIKTI => hashSet = [kiwi, pineapple, strawberry, peach]

    }

    private static HashSet<String> changeSet(HashSet<String> hashSet, String str2, String str1) {
    if(hashSet.contains(str1)){
        hashSet.remove(str1);
        hashSet.add(str2);
    }
    return hashSet;
    }
}