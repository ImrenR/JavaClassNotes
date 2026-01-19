package j30_Map;

import java.util.HashMap;

public class C01_HashMap {

    public static void main(String[] args) {
        /*  Map bir interface'dir. Map interface'inin 3 tane child class'i vardir

        1) HashMap: HashMap key-value yapisini kullanir. Key ve value   programci tarafindan yazilir. Key değeri benzersiz(unique) olmalı
                    dublicate kabul etmez.
                    Key ve value'da null degeri kullanilabilir. Key'de  1'den fazla null degeri kullanilirsa Java son kullanilan
                    null'i kabul eder. Value'da 1'den fazla null degeri kullanilabilir.
                    HashMap  print edildiğinde hem key degerleri hem de value degerleri aralarina = sembolu konularak print eder
                    HashMap'ler tanımlanırken rastgele(hurra style) siralama yapar  HasMap map'ler arasinda en hizlisidir.
                    HashMap'ler "thread safe" degildir.
         */
        // map tanımlanma

        HashMap<String,String> hashMap=new HashMap<>(); // bos non initialize hashmap objesi olusturuldu.



         // map.put()-> girilen key, value map'e elaman(entry) olarak atanır.

        hashMap.put("Amazon","296 euro");
        hashMap.put(null,"220 euro");
        hashMap.put(null,"296 euro");
        hashMap.put("Ebay",null);
        hashMap.put("Apple","450 euro");
        hashMap.put("Apple","550 euro");
        hashMap.put("Teknosa","330 euro");
        hashMap.put("Media Markt","444 euro");

        // map print -> sout(map)
        System.out.println("hashMap = " + hashMap);
        // hashMap = {null=296 euro, Apple=550 euro, Ebay=null, Teknosa=330 euro, Media Markt=444 euro, Amazon=296 euro}



    }

}
