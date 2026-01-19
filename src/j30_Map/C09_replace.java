package j30_Map;

import java.util.HashMap;

public class C09_replace {
    public static void main(String[] args) {
        //map.replace();-> girilen  value değeri ilgili Key'de update edilip oldValue(update öncesi eski value) return edilir.

        HashMap<String, String> hm = new HashMap<>();//bos hm tanımlandı
        hm.put("Amazon", "296 Euro");
        hm.put("Saturn", "200 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple", "450 Euro");
        hm.put("Teknosa", "333 Euro");
        hm.put("Media Markt", "444 Euro");
        System.out.println("hm replace oncesi= " + hm);

        System.out.println("hm.replace(\"Amazon\",\"haluk\") = " + hm.replace("Amazon", "haluk")); // brda amazon value nun yerine haluk atandi

        System.out.println("hm = " + hm);

    }
}
