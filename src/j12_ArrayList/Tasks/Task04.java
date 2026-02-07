package j12_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Task04 {
    public static void main(String[] args) {
        /* TASK :

         * Input olarak verilen listteki isimlerden
         * icinde ‘a’ ve 'A'  harfi bulunanlari silen bir code create ediniz.
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */
ArrayList<String> list1 = new ArrayList<>(
        Arrays.asList("Ali","Veli","Ayse","Fatma","Omer")
);
        Iterator<String> itr = list1.iterator();

        while(itr.hasNext()) { // sirada eleman var mi
            String isim = itr.next(); // siradaki elemani getir
            if(isim.toLowerCase().contains("a")) {
                itr.remove(); // son getirilen elemani sil
            }
        }
        System.out.println(list1);
    }
}
