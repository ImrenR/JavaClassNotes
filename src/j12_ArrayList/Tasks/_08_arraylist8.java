package j12_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _08_arraylist8 {

    /*
        secondMax()  isminde bir method oluşturun.
        Parametre olarak integer ArrayList.
        Return tipi int olmalı.
        ArrayList'teki en yüksek (maximum) 2. değeri bulun ve onu döndürün
        ÖRN;
        ArrayList   --  5,3,4,6,7
        CEVAP : 6
     */

    public static void main(String[] args) {
List<Integer> list1 = new ArrayList<>(Arrays.asList(5,3,4,6,7));
int list = secondMax(list1);
        System.out.println("list = " + list);
    }

    private static int secondMax(List<Integer> list1) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int num:list1) {
            if(num >max1){
                max2=max1;
                max1=num;
            } else if (num > max2 && num < max1) {
                max2=num;

            }
        }
    return max2;
    }
}
