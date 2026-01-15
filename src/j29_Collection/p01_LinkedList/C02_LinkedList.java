package j29_Collection.p01_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Objects;

public class C02_LinkedList {
    public static void main(String[] args) {

LinkedList<Object> ll1=new LinkedList<>(); //Data type object (Butun classlarin babasi)
        //bad practice => app slows

        ll1.add(31);
        ll1.add("imren");
        ll1.add('$');
        System.out.println("ll1 = " + ll1); //[1905,imren,$]

        // Linked remove()=>
        System.out.println("ll1.remove() = " + ll1.remove());
        System.out.println("ll1 remove sonrasi= " + ll1);
        System.out.println("ll1.remove(\"haluk\") = " + ll1.remove("haluk"));
        System.out.println("ll1.remove(\"cuger\") = " + ll1.remove("cuger"));
        System.out.println("ll1.removeFirst() = " + ll1.removeFirst());
        System.out.println("ll1.removeLast() = " + ll1.removeLast());
        System.out.println("ll1 removelar sonrasi = " + ll1);

        LinkedList<String> ll2 =new LinkedList<>(Arrays.asList("havuc dilimi","dondurmali irmik","tirilece","kunefe","su muhallebisi", "hamsikoy muhallebisi"));
        ll1.addAll(ll2);
        System.out.println("ll1 add all ll2 hali = " + ll1);
        System.out.println("ll1.removeAll(ll2) = " + ll1.removeAll(ll2));
        System.out.println("ll1 = " + ll1);
        System.out.println("ll2.element() = " + ll2.element()); // element ilk elemanini verir
        // LinkedList get() getFirst() getLast() ->
        System.out.println("ll2.get(3) = " + ll2.get(3));//
        System.out.println("ll2.getFirst() = " + ll2.getFirst());
        System.out.println("ll2.getLast() = " + ll2.getLast());

        LinkedList<Integer> sayiList =new LinkedList<>(Arrays.asList(1,3,4,6,7,45,59,38));
        System.out.println("sayiList = " + sayiList);
        sayiList.remove(3); // 6
        sayiList.remove(45); // CTE
        // remove method parametre integer alirsa LinkedList  data type integer oldugu durumlarda meth parametre obj degil indexi derler.



        // remove () meth parametre integer alirsa List data Type integer oldugunda meth parametre obj degil index tanimlanir.


    }
}
