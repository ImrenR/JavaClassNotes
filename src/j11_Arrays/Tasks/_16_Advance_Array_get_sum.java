package j11_Arrays.Tasks;

import java.util.Arrays;

public class _16_Advance_Array_get_sum {

    public static void main(String[] args) {

        /*
        Bu şekilde bir String oluşturunuz.  "$12 $23 $10 $2 $5 $2"
        $ işaretlerini kaldırın ve sayıları toplayın.
        Sayıların toplamını yazdırın.
         */

        //Kodu aşağıya yazınız.
String sayilar = "$12 $23 $10 $2 $5 $2";

String [] newArray = sayilar.split(" ");

        System.out.println("Sring bos diziye dolduruldu = " + Arrays.toString(newArray));     // String sayilar diziye dolduruldu

           int toplam=0;
               for(String s: newArray) {
                   s=s.replace("$",""); // isareti kaldirdik => String in metodudur. => substring(parca alma) - equals -compare to - contains - startswith-indexof-endswith-lastindexof-replace-split etc
                    int sayi= Integer.parseInt(s);
                    toplam +=sayi;
               }
        System.out.println(toplam);
    }
}