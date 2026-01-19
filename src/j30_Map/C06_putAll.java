package j30_Map;

import java.util.HashMap;

public class C06_putAll {
    public static void main(String[] args) {


        // map.putAll();-> Girilen map istenen map'e eklenir.

        HashMap<String, String> hm1 = new HashMap<>();//bos hm tanımlandı

        hm1.put("Amazon", "296 Euro");
        hm1.put("Saturn", "200 Euro");
        hm1.put("Vatan", "111 Euro");
        hm1.put("Apple", "450 Euro");
        hm1.put("Teknosa", "333 Euro");
        hm1.put("Media Markt", "444 Euro");
        System.out.println("hm = " + hm1);


        HashMap<String, String> hm2 = new HashMap<>();//bos hm tanımlandı

        hm2.put("javaCAN", "imren");
        hm2.put("javaSU", "haluk");
        hm2.put("javaNAZ", "elvan");
        hm2.put("javaNUR", "tulin");
        hm2.put("javaTAR", "mehmet");

        System.out.println("hm2 = " + hm2);//
        hm1.putAll(hm2);
        System.out.println("hm1 putAll sonrasi= " + hm1);
        System.out.println("hm2 putAll sonrasi = " + hm2);

        HashMap<String,String> hm3=hm1; // hm1 hm3 e atandi
        System.out.println("hm3 = " + hm3);

        HashMap<String,String> hm4= new HashMap<>(hm2);
        System.out.println("hm4 = " + hm4);


    }
}
