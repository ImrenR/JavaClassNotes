package j12_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _06_arraylist6 {

    /*
    hillNum() isminde bir method oluşturun.
    Parametre olarak Integer ArrayList
    Return tipi int,
    Eğer sayı, önceki sayıdan küçük ve bir sonraki sayıdan büyük ise, o sayıyı yazdırın.
    Örneğin;
    ArrayList  5,4,6,2,1
    2, 6'dan küçük ve 1 den büyüktür.
    Return 2 olmalı.
     */

    public static void main(String[] args) {
List<Integer> arr = new ArrayList<>(Arrays.asList(5,4,6,2,1));
int hill =hillNum(arr);
        System.out.println("hill = " + hill);
    }


    private static int hillNum(List<Integer> arr) {
        for (int i = 1; i < arr.size()-1; i++) {
            if (arr.get(i) > arr.get(i-1) && arr.get(i)> arr.get(i+1)) {

                return arr.get(i);
            }

        }
        return -1;
    }
}
