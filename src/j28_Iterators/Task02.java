package j28_Iterators;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Task02 {
    public static void main(String[] args) {

            /*  task->

        Bir listedeki istenen sayi araliginda olmayan-> 20den kck 40 dan byk
        elementleri silip print eden code create ediniz.

        (2. liste olusturmadan, gecerli liste uzerinde iterator ile islem yapiniz)

	    Orn : [2,13,56,23,45,14,40] istenen aralik 20 ile 40 arasi (sinirlar dahil)
	    output: [23,40]

         */

        List<Integer> list=new ArrayList<>(Arrays.asList(2,13,56,23,45,14,40));
// step->>1 :

        ListIterator<Integer> yeniListe= list.listIterator();
        // cursor 2 nin onunde durdu

        // step 2->>:
        while (yeniListe.hasNext()){ // listenin baska elemani var mi => T => iceri girer
          int sayi=  yeniListe.next(); // ilk elemanin uzerinden gecer ve onu rn eder ve digerleri icinde tek tek donguden gecer
            if(sayi<20 || sayi>40){
              yeniListe.remove(); // 20 den kucukleri 40 dan buyukleri siler
            }

        }
        System.out.println("list = " + list); // [23,40]
    }
}
