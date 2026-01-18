package j29_Collection.p02_Set.Tasks;

import java.util.Arrays;
import java.util.HashSet;

public class Task06 {
    public static void main(String[] args) {
// Task 1 : bir metod oluşturup bir HashSet'i verilen bu numaralar ile doldurunuz
// [1, 2, 3, 4, 5, 5, 5, 6, 7, 8]
// bu işlemi generateSet() metodunda yapınız ve
// mainden yazdırınız.

// AddElements şeklinde bir metodla 1 veya 1 den fazla sayı eklenebilen metodu  yazınız.

       HashSet<Integer> hashSet = generateSet();
        System.out.println("hashSet = " + hashSet);//hashSet = [1, 2, 3, 4, 5, 6, 7, 8]
       addElements(hashSet,10,11,12,13);
        System.out.println("hashSet = " + hashSet); // hashSet = [1, 2, 3, 4, 5, 6, 7, 8, 10, 11, 12, 13]
    }

    private static void addElements(HashSet<Integer> hashSet, Integer... numbers) {
    hashSet.addAll(Arrays.asList(numbers));
    }

    private static HashSet<Integer> generateSet() {
        return new HashSet<>(Arrays.asList(1,2,3,4,5,5,5,6,7,8));
    }


}
