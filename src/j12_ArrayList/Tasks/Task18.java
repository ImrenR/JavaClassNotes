package j12_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.List;

public class Task18 {
    public static void main(String[] args) {
        /* Task->  Verilen bir listede, istenen iki index'deki elementlerin yerini
         kalici olarak degistiren bir method create ediniz

         */

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(1);
        sayilar.add(7);

        System.out.println("sayilar = " + sayilar);
        // Ornek : 1. ve 4. index i degistir

        swapIndexes(sayilar,1,4);
        System.out.println("sayilar = " + sayilar);

    }

    private static void swapIndexes(List<Integer> sayilar, int index1, int index2) {
        if(index1 < 0 || index2 <0 || index1 >= sayilar.size() || index2 >= sayilar.size()){
            System.out.println("Hatali index girisi!");
            return;
        }

        Integer temp = sayilar.get(index1);
        sayilar.set(index1,sayilar.get(index2));
        sayilar.set(index2,temp);

    }


}
