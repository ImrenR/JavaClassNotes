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

        String[] elmn = {"Apple", "Orange", "Banana", "Pineapple"};
         boolean bulundu =false;

        for (int i = 0; i < elmn.length; i++) {
            if (elmn[i].contains("Apple")) {
                bulundu =true;
                break; // bulununca donguden cik.
            }else System.out.println("Bulundu mu ?=" + bulundu);
        }
        System.out.println("elmn dizisinde apple vardir =" + bulundu );
    }
}