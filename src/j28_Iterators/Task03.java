package j28_Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class Task03 {
    public static void main(String[] args) {
        // Task->verilen listedeki her elementi 3 artirip print eden code create ediniz..

        ArrayList<Integer> sayiList = new ArrayList<>(Arrays.asList(14, 25, 36, 47, 58, 69, 12, 45, 78));

// step 1 =>
        ListIterator<Integer> newList= sayiList.listIterator();
 // step 2 =>
        while (newList.hasNext()){ // ilk elamandan sonra eleman var mi varsa while dongusunun icine gir
            int num = newList.next(); //  her elemanin uzerinden gec son elemana kadar
             num =num+3;
            newList.set(num); // elemanlari listede guncelle
        }
        System.out.println("sayiList = " + sayiList); // sayiList = [17, 28, 39, 50, 61, 72, 15, 48, 81]
    }
}
