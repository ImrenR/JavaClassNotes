package j28_Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class C02_Previous {
    public static void main(String[] args) {

List<String> l1 = new ArrayList<>(Arrays.asList("Trileçe", "KazanDibi", "HavucDilimi", "CennetÇamuru", "Künefix", "Bal-Gaymahhh", "Kerebiç"));
        System.out.println("l1 ilk hali  = " + l1);

        System.out.println("   ***   task01   ***   ");

        // Task01-> l1 elemanlarını  sondan başa dogru print eden code create ediniz.
ListIterator<String> litr1=l1.listIterator();
// step 2
while (litr1.hasNext()){ // step => 1.5 sondan basa gelmek icin once cursor en sona konumlandi
    litr1.next();
} // burasi false olana kadar calisir ve cursor burda durur. hasnext son elemanin sonuna geldiginde cursor orada durur ve false doner

while(litr1.hasPrevious()){
    System.out.println("litr1.previous() = " + litr1.previous());
}




        System.out.println("   ***   task02   ***   ");
        // Task02-> l1 son elemanını :-) ile update edip print eden code create ediniz.

        List<String> l2 = new ArrayList<>(Arrays.asList("Imren", "Haluk", "Tulin", "Erdem", "Mehmet", "Ali Haydar", "Hidayet"));
ListIterator<String> litr2=l2.listIterator();

while(litr2.hasNext()){
    litr2.next();
    if(litr2.hasNext()==false){ // elemanin sonuna geldim demektir.elemanin sonuindadir cursorum
    litr2.previous(); // cursor son elemanin onunde
        litr2.set((litr2.next() + ":-)")); // onunde bulundugun elemanin icine gir
    }
}

        System.out.println(l2);
    }
}
