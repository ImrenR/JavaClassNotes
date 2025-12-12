package j13_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C01_ForEachLoop {
    public static void main(String[] args) {
                   /*
        for-each loop for loop'un gelişmiş halıdir.
        1. clean code- yazım kolaylığı
        2. code okuma kolaylıgı
        3. hata yapma riskini azaltır.
         */
        List<Integer> sayiList = new ArrayList<>(List.of(16, 21, 33, 54, 15, 45, 58));

        System.out.println("   ***   Task01   ***   ");
        // Task01-> sayiList elemanlarını ayrı satırda print eden code create ediniz.

        System.out.println("   ***   for i   ***   ");

        for (int i = 0; i <sayiList.size() ; i++) { //ArrayList oldugu icin length degil size al
            System.out.println(sayiList.get(i));
        }


        System.out.println("   ***   for each   ***   ");

        for (Integer a : sayiList){
            System.out.println("a = " + a);
        }


        System.out.println("   ***   Task02   ***   ");
        // task2-> sayiList tek elemanlarını ilk 3 eleman hariç print eden code create ediniz.

        for( Integer b : sayiList.subList(3,sayiList.size())){
            if (b%2 == 1) {
                System.out.println(b);
            }
        }




        System.out.println("   ***   Task03   ***   ");
        // task03-> sayiList  elemanlarını 2 ve 5 index(2,3,4,5) dahil  toplamını print eden code create ediniz.

int toplam =0;
        for( Integer b : sayiList.subList(2,6)){
            toplam +=b;

        }
        System.out.println(toplam);
    }
}
