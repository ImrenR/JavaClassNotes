package j16_PassByValue;

import java.util.ArrayList;
import java.util.List;

public class C03_PassByValue {
    public static void main(String[] args) {
                     /*
 java non-primitive(Class array list-> referans ) data turlerinde obj kendisi değil de dataları değişirse
        obj referans ve kendisi değişmediği dataları değişikliğini kalıcı yapar.
         */

        // Task -> list elemanları 24,20,87 iki farklı method ile list elemanlarını update edip print eden METHOD create ediniz.

        //1. method-> with for each

        ArrayList<Integer> sayiList = new ArrayList<>(List.of(24,20,87));
        System.out.println("Update oncesi sayiList = " + sayiList); // [24, 20, 87]
        listUpdate1(sayiList); // [24, 20, 87]
        listUpdate2(sayiList); // [59, 55, 122]
        System.out.println("Update sonrasi sayiList = " + sayiList); // [59, 55, 122]
       // ONEMLI NOT ! = 1.methodta asyiList a ile geldi. Her bir elemana 31 ekledik. Ama atama yapilmadi o yuzden degismedi.
        // PassbyValue yu biz ancak ataam yapinca set edince degistirebilirz. 2. methodtaki gibi

        // 2. method-> set(index,value)


    }// main sonu

    public static void listUpdate1(ArrayList<Integer> a){
        for(Integer avuc: a){
            avuc += 31;

        }
        System.out.println("updateList1 run edildi = " + a);
    }

    public static void listUpdate2(ArrayList<Integer> a){
        for (int i = 0; i <a.size(); i++) {
            a.set(i,a.get(i) +35);
        }
        System.out.println("updateList2 run edildi = " + a);
    }

} //Class sonu

























