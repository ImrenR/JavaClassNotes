package j11_Arrays.Tasks;

import java.util.Arrays;

public class _06_Array_contains {

    public static void main(String[] args) {

        /*
        String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
        Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
        Eğer aitse "true" çevirin.
        Loops (döngüler) kullanın.
         */

        //Kodu aşağıya yazınız..

String [] elmn = {"Apple", "Orange", "Banana", "Pineapple"};
boolean bulundu = false;

// For each dongusuyle check etme

for (String eleman :elmn){
    if (eleman.equals("Apple")){
        bulundu =true;
        break;
    }
        }
        System.out.println(bulundu);
    }
}
