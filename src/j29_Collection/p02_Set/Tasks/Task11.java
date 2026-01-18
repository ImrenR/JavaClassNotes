package j29_Collection.p02_Set.Tasks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Task11 {
    public static void main(String[] args) {
        // Task 1 : Bir HashSet random olarak 10(set.size(10)) adet olacak şekilde
        // 1 den 20 e kadar olan sayılarla doldurup yazdırın
        // Task 2 : Bu SET i bir fonksiyonda diziye çevirinizve yazdırınız.



        HashSet<Integer> liste=new HashSet<>();
        Random rnd=new Random();

         while(liste.size() <10){
             liste.add(rnd.nextInt(20)+1);
         }

        System.out.println("liste = " + liste);
        System.out.println("liste.size() = " + liste.size());


// set i Array e cevir ve yazdir
        Integer[] array=convertToArray(liste);
        System.out.println("Array version: ");
        for(Integer num:array){
            System.out.print(num+ " ");
        }
    }

    // seti array e ceviren metod

             // metodun donus tipi bura: Integer[]       //Metodun parametresi,yani cevirmek istedigin set = HashSet
    private static Integer[] convertToArray(HashSet<Integer> liste) {

        return liste.toArray(new Integer[0]);
    }

}

