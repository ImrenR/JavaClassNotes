package j11_Arrays;

import java.util.Arrays;

public class C05_Arrays_equals {
    public static void main(String[] args) {
        // Arrays.equals(arr1,arr2);-> girilen iki arrayin index ve eleman value kontrolu yapar true false return eder

        int arr1[] = {2, 5, 13, 65, 49, 38, 33, 58, 27};
        int arr2[] = {21, 52, 14, 63, 49, 31, 35, 53, 26};
        int arr3[] = {2, 13, 5, 65, 38, 49, 33, 58, 27};


        // Array'ı String'e convert(çevirme)...

        System.out.println("Arrays.equals(arr1,arr2) = " + Arrays.equals(arr1, arr2)); // false
        System.out.println("Arrays.equals(arr1,arr3) = " + Arrays.equals(arr1, arr3)); //false
        Arrays.sort(arr1);
        Arrays.sort(arr3);
        System.out.println("Arrays.equals(arr1,arr2) = " + Arrays.equals(arr1, arr3)); // true
    }
}
