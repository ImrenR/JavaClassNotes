package j07_StringManipulation;

import java.util.Scanner;

public class C03_CharAt {
    public static void main(String[] args) {
           /*
        charAt() methodu parametre int olarak girilen index'deki char değerini return eder.
        Çoooğğğ önemli ->  index değeri her zaman 0'dan başlar.-> ucağın koltuk nosu 0'dan başlar
         */

String str = "Java";

        System.out.println(str.charAt(0)); // J
        System.out.println(str.charAt(3)); //a
        String kelime = "I love you JavaCan";

        char harf = kelime.charAt(kelime.length()- 4);
        System.out.println(harf);
    }
}
