package j12_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task17 {
    public static void main(String[] args) {
        // Task->  verilen bir listede tekrar eden sayilari sadece 1 kez print eden METHOD create ediniz
        // input : [1, 3, 5, 3, 5, 6, 1, 7]
        // output [1, 3, 5, 6, 7]

        List<Integer> sayilar = new ArrayList<>(
                Arrays.asList(1, 3, 5, 3, 5, 6, 1, 7)
        );
        List<Integer> sonuc = tekrarEtmeyenListe(sayilar);

        System.out.println(sonuc);


    }//main sonu

    private static List<Integer> tekrarEtmeyenListe(List<Integer> sayilar) {
    List<Integer> yeniListe = new ArrayList<>();

    for(Integer sayi: sayilar) {
        if(!yeniListe.contains(sayi)){
            yeniListe.add(sayi);
        }
    }
    return yeniListe;
    }


}//class sonu
