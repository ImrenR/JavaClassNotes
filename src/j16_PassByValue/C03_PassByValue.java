package j16_PassByValue;

import java.util.ArrayList;
import java.util.List;

public class C03_PassByValue {
    public static void main(String[] args) {
                     /*
        java non-primitive(Class array list-> referans ) data turlerinde obj kendisi değil de dataları değişirse
        obj referans ve kendisi değişmediği dataları değişikliğini kalıcı yapar.
         */
        // Task -> list elemanları 24,20,87 iki farklı method ile list elemanlarını
        //      update edip print eden METHOD create ediniz.
        //1. method-> with for each 2. method-> set(index,value)

        ArrayList<Integer> sayiList = new ArrayList<>(List.of(24, 20, 87));//main sonu
        System.out.println("sayiList = " + sayiList);

    }// main sonu

public static void listUpdate(ArrayList<Integer> a){
        for (Integer avuc: a){
            avuc+=31;
        }
    System.out.println("listUpdatemethod run edildi =" + a);
}
} //Class sonu

























