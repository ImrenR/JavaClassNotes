package j29_Collection.p01_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class C03_LinkedList {
    public static void main(String[] args) {

        LinkedList<String> ll1 = new LinkedList<>(Arrays.asList("balcanKebap", "Cüger", "haşhaşKebap", "guzuGerdan", "incik", "küşşşleme"));

        System.out.println("ll1 ilk hali = " + ll1);// [balcanKebap, Cüger, haşhaşKebap, guzuGerdan, incik, küşşşleme]


        // Linked remove()=>

        System.out.println("ll1.remove() = " + ll1.remove()); // balcanKebap ilk elemani sildi
        System.out.println("ll1 remove sonrasi= " + ll1); //[Cüger, haşhaşKebap, guzuGerdan, incik, küşşşleme]
        System.out.println("ll1.remove(\"haluk\") = " + ll1.remove("haluk")); // false haluk diye bir e yok
        System.out.println("ll1.remove(\"cuger\") = " + ll1.remove("Cüger")); // true silindi
        System.out.println("ll1.removeFirst() = " + ll1.removeFirst()); // Cuger
        System.out.println("ll1.removeLast() = " + ll1.removeLast()); // kusssleme
        System.out.println("ll1 removelar sonrasi = " + ll1); //[ guzuGerdan, incik]



        LinkedList<String> ll2 =new LinkedList<>(Arrays.asList("havuc dilimi","dondurmali irmik","tirilece","kunefe","su muhallebisi", "hamsikoy muhallebisi"));


        ll1.addAll(ll2); // [ guzuGerdan, incik, havuc dilimi, dondurmali irmik, tirilece, kunefe, su muhallebisi, hamsikoy muhallebisi]
        System.out.println("ll1 add all ll2 hali = " + ll1);
        System.out.println("ll1.removeAll(ll2) = " + ll1.removeAll(ll2)); // true
        System.out.println("ll1 = " + ll1); // [ guzuGerdan, incik]
        System.out.println("ll2.element() = " + ll2.element()); // element ilk elemanini verir => havuc dilimi

        // LinkedList get() getFirst() getLast() ->

        System.out.println("ll2.get(3) = " + ll2.get(3));// kunefe
        System.out.println("ll2.getFirst() = " + ll2.getFirst()); // havuc dilimi
        System.out.println("ll2.getLast() = " + ll2.getLast()); //  hamsikoy muhallebisi

        LinkedList<Integer> sayiList =new LinkedList<>(Arrays.asList(1,3,4,6,7,45,59,38));

        System.out.println("sayiList = " + sayiList);
        sayiList.remove(3); // 6
        // sayiList.remove(45); // CTE
        //! ONEMLI NOT !-->> remove method parametre integer alirsa LinkedList  data type integer oldugu durumlarda
        // meth parametre obj degil indexi derler.





    }
}
