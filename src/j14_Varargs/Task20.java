package j14_Varargs;

import java.util.ArrayList;
import java.util.List;

public class Task20 {
    static void main() {
        //Create a method analyzeSentence that accepts varargs of Strings representing words.
        //
        //Print:
        //
        //Total number of words
        //
        //Number of words longer than 4 characters
        //
        //The longest word
        //
        //Words that start with a vowel


        String yeniListe = analyzeSentence("Imren", "Ali", "Unzile", "Berfu", "lolo");
        System.out.println("yeniListe = " + yeniListe);
    }


    private static String analyzeSentence(String... isimler) {
        int uzunKelimaSayisi = 0;
        String enUzunKelime = "";
        int toplamKelime = isimler.length;
        List<String> sesliIleBaslayanlar = new ArrayList<>();
        for (String avuc : isimler) {

            if (4 < avuc.length()) {
                uzunKelimaSayisi++;

            }
            if (avuc.length() > enUzunKelime.length()) {
                enUzunKelime = avuc;
            }
            char ilkHarf = Character.toLowerCase(avuc.charAt(0));
            if ("aeiou".indexOf(ilkHarf) >= 0) {
                sesliIleBaslayanlar.add(avuc);
            }
        }

        String sonuc = "toplam kelime sayisi : " + toplamKelime + "4 karakterden uzun kelime" + uzunKelimaSayisi
                + " en uzun kelime : " + enUzunKelime + "Sesli harfle baslayab kelimeler : " + sesliIleBaslayanlar;
        return sonuc;
    }
}