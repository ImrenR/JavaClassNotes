package j11_Arrays.Tasks;

import java.util.Arrays;

public class Task06 {
    public static void main(String[] args) {
        // Task-> verilen bir int arrayi elemanlarını
        // buyukten kucuge siralayip return eden METHOD create ediniz



        int[] arr = {3, 6, 78, 89, 5};

        int[] result = sortDesc(arr);

        System.out.println(Arrays.toString(result));


    }
    public static int[] sortDesc(int[] arr) {
Arrays.sort(arr);

int [] descArr = new int[arr.length];
int index = 0;

        for (int i = arr.length-1; i >=0 ; i--) {
              descArr[index] = arr[i];
              index++;
        }
        return descArr;
    }
}
