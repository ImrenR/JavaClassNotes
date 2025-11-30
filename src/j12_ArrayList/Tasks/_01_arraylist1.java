package j12_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class _01_arraylist1 {

    /*
        ismi getCount() olan bir method oluşturun.
        Parametre olarak bir String ArayList  ve  bir tane String

        Return tipi int olmalı.

        ArrayList'teki bir değerin kaç kez tekrarlandığını belirtin ve döndürün.
        Örneğin;
        ArrayList = Orange , Kiwi , Peach , Banana , Orange
        String Orange:
        Count = 2 olmalı. (Orange 2 kez yazılmış)
         */

    public static void main(String[] args) {

       ArrayList<String> strList = new ArrayList<>();
        strList.add("JavaScript");
        strList.add("Ruby");

        System.out.println("strList =" + strList);
        System.out.println("strList.size() = " + strList.size()); //  eleman sayisi
        System.out.println("strList.get(1) = " + strList.get(1)); //  Ruby
        System.out.println("strList.getFirst() = " + strList.getFirst()); // JavaScript

       strList.set(1,"Imren");
        System.out.println("strList = " + strList);

       Object clonedList = strList.clone();
       // clone lanacagi zaman obje klasinin icine alinmak zorundadair ve array komutlari burada
        // kullanilmaz get sort gibi
        System.out.println("clonedList = " + clonedList);
        //ensureCapacity();
        // Bu metot arrayList in kapasitesini belirtilen degere yukseltir.
        // Bu sayede gelecekte eleman ekleme islemleri daha hizli gerceklesebilir.

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.ensureCapacity(10);
        // Increases the capacity of ArrayList to 10 ;
        //




    }
}
