package j28_Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class Task01 {
    public static void main(String[] args) {

        /*
        task -> Verilen bir integer listin tek  elemanlarının karesini tersten iterator  print eden code create ediniz
         */
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(14, 25, 36, 47, 58, 69, 12, 45, 78));

        ListIterator<Integer> llt= list.listIterator();

        //Listenin sonuna git
        while (llt.hasNext()){
            llt.next();

        }


        //Listi tersten dolas ve tek elemanlarin karesinni print et
        while (llt.hasPrevious()){ // iteratorun su anki konumundan once bir eleman var mi ? varsa T verir ve iceri girer, bu dongu listenin basina gidene kadar devam eder.
            int num=llt.previous(); // Cursoru bir onceki elemana tasir.ve o elemani dondurur. yani son elemanin ustunden gecer ve onu dondurur.
            if(num%2 !=0){
                System.out.println("num*num = " + num * num);
            }
        }

    }
}
