package j12_ArrayList.Tasks;

public class _12_array1 {

    /*
    dupicate() isminde bir method oluşturun.
    Parametresi int Array olmalı
    Return tipi boolean
    Eğer Array içinde çiftleme(yineleme) var ise true dönmeli.
    Eğer Array içinde çiftleme(yineleme) yok ise false dönmeli.
    
    Örnek1:
    Input: [1,2,3,1]
    Output: true

    Örnek 2:
    Input: [1,2,3,4]
    Output: false
         */

    public static void main(String[] args) {
           int[] arr1 = {1,2,3,1};
           int[] arr2 = {1,2,3,4};

        System.out.println(duplicate(arr1));
        System.out.println(duplicate(arr2));

    }

    private static boolean duplicate(int[] arr) {
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length; j++) {
                       if(arr[i] == arr[j])    {
                           return true;
                       }
            }
        }
        return false;
    }
}