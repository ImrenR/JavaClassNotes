package j29_Collection.p02_Set.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Task10 {

	public static void main(String[] args) {

		// Verilen bir Array'deki tekrarli elemanlari silip

        // unique elemanlardan olusan bir Array'e ceviren

        // bir method yaziniz


        ArrayList<Integer> liste=new ArrayList<>(Arrays.asList(1,2,4,5,6,7,8,9,10,2,3,4,5,6,7,8,9,0));


       ArrayList<Integer> liste1=uniqueListe(liste);
        System.out.println("liste1 = " + liste1); // liste1 = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    }
    private static ArrayList<Integer> uniqueListe(ArrayList<Integer> liste) {
        return new ArrayList<>(new HashSet<>(liste));
    }
}
