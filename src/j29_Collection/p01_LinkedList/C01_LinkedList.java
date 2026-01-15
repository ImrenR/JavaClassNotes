package j29_Collection.p01_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class C01_LinkedList {
    public static void main(String[] args) {
          /*
        LinkedList .....
        1- LinkedList'de elemanlar "data" ve "adress"(next) olmak uzere iki kısımdan oluşur ve eleman yerine "node" olarak tanımlanır.
        2- LinkedList'te ilk node data barındırmayan sadece adres bulunduran "head" node tanımlanmıştır.
        3- LinkedList'te son node adres kısmı null olan sadece data bulunduran "tail" node tanımlanmıştır.
        4- ArrayList searching LinkedList node ekleme(add) ve silmede(remove) daha avantıjlıdır.
        5- LİnkedLİst -> tren vagon ilşikisi baglantısı gibi düşünülebilir
        6- Collection obj tanımlanırken cons Class(LinkedList,ArrayList...) olmalı interface(List, Queue ...) olmamasına dikkat edilmeli
            Ancak obj DataType olarak parent interface tanımlanabilir.
        7- LinkedList class iki tane parent interface'den(List,Queue) implement etmiştir.
         */
         // LinkedList print ->
         // LinkedList add()->

    LinkedList<String> ll1=new LinkedList<>(Arrays.asList("balcan kebap","ciger sis","cop sis","kilis tava","kusleme"));
    //LinkedList print =>
        System.out.println("ll1 = " + ll1);//
        //LinkedList add =>
        ll1.add("kagit kebabi");//
        System.out.println("ll1 add sonrasi = " + ll1);//
        ll1.add(2,"kagit kebap"); //
        System.out.println("ll1 add index saonrasi = " + ll1);//
        ll1.addFirst("kuyu buryan"); //
        System.out.println("addFrist sonrasi ll1 = " + ll1);
        ll1.addLast("adana kebap");
        System.out.println("ll1 = " + ll1);//

        LinkedList<String> ll2= new LinkedList<>(Arrays.asList("baklava","tirlece","kunefe","sutlac"));
        System.out.println("ll2 = " + ll2);
        ll2.addAll(ll1);
        System.out.println("ll2 addAll saonrasi= " + ll2);//

        ll1.addAll(3,ll2);
       // ll1.addAll((3,"falan"));// CTE parametre coll dan baskasi olamaz
        System.out.println("ll1 addAll sonrasi= " + ll1);


    }
}
