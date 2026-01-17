package j29_Collection.p01_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Objects;

public class C02_LinkedList {
    public static void main(String[] args) {

LinkedList<Object> ll1=new LinkedList<>(); //Data type object (Butun classlarin babasi)
        //bad practice =>  slows the app

        ll1.add(31);
        ll1.add("imren");
        ll1.add('$');
        System.out.println("ll1 = " + ll1); //[1905,imren,$]



    }
}
