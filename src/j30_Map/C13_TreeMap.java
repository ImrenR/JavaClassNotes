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



        //  TreeMap<String, String> tm2 =hm; // CTE-> dataTYpe MissMatch
        //map.cilingKey();-> girilen key map'de varsa return eder yoksa parametre girilen keyden buyuk en kucuk key return eder
        //map.cilingKey();-> en kucuk abi-abla(en yakın buyuk) varsa return eder yoksa null atar

        //map.floorKey();-> girilen key map'de varsa return eder yoksa parametre girilen keyden kucuk en buyuk key return eder
        //map.floorKey();-> en buyuk kardes(en yakın kardes) varsa return eder yoksa null atar

        // descendingKeySet()->azalan sıralama
        // ascendingKeySet()->artan sıralama :NT->kck->byk



    }
}
