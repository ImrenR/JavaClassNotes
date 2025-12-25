package j11_Arrays.Tasks;

import java.util.Arrays;

public class _15_Word_Count {

    public static void main(String[] args) {

        /*
        Bu String'i oluşturun. "Removes white space from both ends of a string"
        String'deki kelime sayısını yazdırınız.
         */

        //Kodu aşağıya yazınız.

String sentence= "Removes white space from both ends of a string";

String  newArray = sentence.replace(" ", "");

    String []  new2Arr = newArray.split(""); // spliti array de kullaniriz

        int kelimeSyasi= new2Arr.length;

        System.out.println("kelimeSyasi = " + kelimeSyasi); // 38

    }
}