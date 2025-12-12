package j13_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C02_ForEachLoop {
    public static void main(String[] args) {
        // task-> iki string array elemanlarının ortak olmasını kontrol edip print eden code create ediniz.
        // .with for-each
        String arr1[] = {"Abdullah", "Ferhat", "Sennur", "Sahin", "Ayse", "Can", "Burak" };
        String arr2[] = {"Sebnem", "Haluk", "Merve", "Sennur", "Ayse", "javaCAN", "javaSU" };
// Bound bilmiyorsam bu ArrayList tir.

       List<String> ortakIsimList = new ArrayList<>(); // her iki arraydan ortak isimlerin store edilecegi bos list tanimlandi

for (String avuc1 : arr1){
    for (String avuc2 : arr2){
         if(avuc2.equals(avuc1)){
             ortakIsimList.add(avuc1);
         }
    }
}
        System.out.println("ortakIsimList = " + ortakIsimList);
    }
}






















