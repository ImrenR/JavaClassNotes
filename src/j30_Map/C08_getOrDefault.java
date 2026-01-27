package j30_Map;

import java.util.HashMap;

public class C08_getOrDefault {
    public static void main(String[] args) {

        // map.getOrDefault(); -> girilen key map'de varsa key'e ait value yoksa default değer return eder

        HashMap<String, String> hm = new HashMap<>();//bos hm tanımlandı
        hm.put("Amazon", "296 Euro");
        hm.put("Saturn", "200 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple", "450 Euro");
        hm.put("Teknosa", "333 Euro");
        hm.put("Media Markt", "444 Euro");
        System.out.println("hm getOrDefault oncesi= " + hm);

        System.out.println("hm.getOrDefault(\"Apple\",\"javaSu\") = " + hm.getOrDefault("Apple", "javaSu")); // 450 Euro
        System.out.println("hm.getOrDefault(\"olmayanKey\",\"haluk\") = " + hm.getOrDefault("olmayanKey", "haluk")); // haluk
        System.out.println("hm.getOrDefault(\"Vatan\",\"111 Euro\") = " + hm.getOrDefault("Vatan", "111 Euro")); // 111 Euro


        System.out.println("hm default sonrasi= " + hm);

    }
}
