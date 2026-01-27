package j30_Map;

import java.util.HashMap;
import java.util.TreeMap;

public class C13_TreeMap {
    public static void main(String[] args) {
              /*
        TreeMap->Mudur sırası
        1-TreeMap key'lerde null değer tanımlanamaz.Fakat value'larda null değer tanımlanabilir.
        2-TreeMap elemanlarının key NATUREL ORDER'a göre tanımlar.
        3-TreeMap synchronized ve thread-safe değildir
        4-TreeMap en yavaş map turudur.app hızı için kullanırken çooook dikkat edilmeli...
         */





TreeMap<Integer,String> tm=new TreeMap<>();// non initialized bos obje declare edildi => Treemapten
       tm.put(101,"imren");
       tm.put(102,"haluk");
       tm.put(103,"erdem");
       tm.put(104,"tulin");
       tm.put(101,"mehmet"); // key duplicate degil value update edilir, duplicate olmaz.

        System.out.println("tm put sonrasi= " + tm); //tm put sonrasi= {101=mehmet, 102=haluk, 103=erdem, 104=tulin}
tm.put(105, null);
//tm.put(null,"elvan"); // RTE=> NullPointerException
        System.out.println("tm = " + tm); //tm = {101=mehmet, 102=haluk, 103=erdem, 104=tulin, 105=null}

        HashMap<String, String> hm = new HashMap<>();//bos hm tanımlandı

        hm.put("Amazon", "296 Euro");
        hm.put("Saturn", "200 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple", "450 Euro");
        hm.put("Teknosa", "333 Euro");
        hm.put("Media Markt", "444 Euro");
        System.out.println("hm putIfAbsent oncesi= " + hm);


      //  TreeMap<String, String> tm2 =hm; // CTE-> dataTYpe MissMatch
        //map.ceilingKey();-> girilen key map'de varsa return eder yoksa parametre girilen keyden buyuk en kucuk key return eder
        //map.ceilingKey();-> en kucuk abi-abla(en yakın buyuk) varsa return eder yoksa null atar

        //map.floorKey();-> girilen key map'de varsa return eder yoksa parametre girilen keyden kucuk en buyuk key return eder
        //map.floorKey();-> en buyuk kardes(en yakın kardes) varsa return eder yoksa null atar

        // descendingKeySet()->azalan sıralama
        // ascendingKeySet()->artan sıralama :NT->kck->byk
    }
}
