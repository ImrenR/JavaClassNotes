package j11_Arrays.Tasks;

import java.util.Arrays;

public class _20_Arrayboth_Ends {

    static void main() {



     /*
     Oluşturacağınız int array'ini, length'i(eleman sayısı) 2 olan ve
     int array'inin(ilk oluşturduğunuz array)
     ilk ve son elementlerini kapsayan yeni array'e return edin.

    Oluşturacağınız int array'i =   ([1, 2, 3, 4])

    Sonuç bu şekilde olmalıdır. [1, 4]
      */
        //Kodu aşağıya yazınız..

 int[] arr = {1,2,3,4};
 int [] newArray = new int[2]; // 2 elemanli bos array
        newArray[0] = arr[0]; // ilk elemani al
        newArray[1] = arr[arr.length-1]; // son elemani al

        System.out.println("newArray.toString() = " + Arrays.toString(newArray));

    }

}

// simdi bos bir array olusturmak icin ne yapariz
/// int [] newArray = new int[5] // 5 elemanli bos bir array olsutruduk
/// Array i stringe cavirmeliyiz ki okunabilinsin Arrays.toString(newArray)