package j30_Map;

import java.util.HashMap;

public class C02_keySet_values {
    public static void main(String[] args) {
        //map.keySet()-> map key değerlerini Set'e(coll.) atayıp return eder
        //map.values()-> map value değerlerini coll.  atayıp return ede

        HashMap<String, String> hm = new HashMap<>();//bos hm tanımlandı

        hm.put("Amazon", "296 Euro");
        hm.put("Saturn", "200 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple", "450 Euro");
        hm.put("Teknosa", "333 Euro");
        hm.put("Media Markt", "444 Euro");
        System.out.println("hm = " + hm);//

         // task-> hm key ve value'ları aynı satırda (satır-satır) print eden code create ediniz

    }
}
