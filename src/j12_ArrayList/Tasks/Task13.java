package j12_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.List;

public class Task13 {
    /* TASK :
     * If the array is { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
     * type a program to create a new array whose elements are like {3, 5+1, 2+7+9, 2+3+5+7}
     * ardışık array elemanların toplamını hesaplayan bir method create ediniz.
     */
    public static void main(String[] args) {

        int arr[] = {3, 5, 1, 2, 7, 9, 2, 3, 5, 7};
        // 3, 5+1, 2+7+9, 2+3+5+7
        List<Integer> sonuc = ardisiktoplam(arr); // method
        System.out.println("sonuc = " + sonuc);

    } // main sonu

    private static List<Integer> ardisiktoplam(int[] arr) {

        List<Integer> list = new ArrayList<>();
        int index= 0;
        int grupBoyutu= 1;

        while (index< arr.length) {
            int toplam=0;
            for (int i = 0; i <grupBoyutu && index <arr.length ; i++) {
                toplam += arr[index];
                index++;

            }
            list.add(toplam);
            grupBoyutu++;
        }
        return list;
    }


}

