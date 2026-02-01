package j10_MethodCreation.Tasks;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Task26 {

    static Scanner input = new Scanner(System.in);//gunes eyledim ki herkeşler erişebile





    public static void main(String[] args) {
        // task-> Girilen bir ifadenin tekrarlı karakterleri yalnızca 1 kez print eden METHOD create ediniz
        // input-> javacanlara selam olsun
        // output-> javcnlr semou
        System.out.println("bir cumle giriniz :");
        String kelime = input.nextLine();
String result =tekrarliKarakterleriAvoidEt(kelime);
        System.out.println("result = " + result);
    }//main sonu

    public static String tekrarliKarakterleriAvoidEt(String str){

        LinkedHashSet<Character> charSet = new LinkedHashSet<>(); // duplicate kabul etmezler

        for (char ch:str.toCharArray()) { //her karakteri set e ekle
            charSet.add(ch);
        } // butun karakterleri charsete ekledik

        // Sonucu stringBuilder le olustur
        StringBuilder result = new StringBuilder(); // string degistirilemez immutable oldugu iocin stringBuilder kullandik
        for (char ch: charSet) {
            result.append(ch); // result a bu harfleri ekle append ile
        }
        return result.toString();
     }

}
