package j33_Lambda.lambdaTutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C09_Skip {


    public static void main(String[] args) {

        List<String> yemahhh = new ArrayList<>(Arrays.asList("küşleme", "soğanlı", "trileçe", "bicibici", "büryan", "Welemen", "cacix", "kokereç", "yağlama", "güveç", "arabAşı", "tantuni"));
        // skip(n) => atlama demektir.
        // Akışın ilk n elemanını attıktan sonra bu akışın kalan
        // elemanlarından oluşan bir akış return eder.
        // akıs n den daha az eleman içeriyorsa
        // skip(n) meth dan sonra boş akıs return eder.skip(n) ara işlemdir.

        System.out.println("  Task   ");

    }//main sonu
public static void print2CharHaricSonHarfSirali(List<String> yemahhh){

    System.out.println(" ********* version1 **********");
    yemahhh.stream()
            .sorted(Comparator.comparing(t->t.charAt(t.length()-1)))
                    .skip(2) // ilk iki eleamani atla
                            .forEach(SeedMethods::strYazdir);
    System.out.println("\n ********* version2 **********");

    System.out.println(Arrays.toString(yemahhh.stream()
            .sorted(Comparator.comparing(t -> t.charAt(t.length() - 1)))
            .skip(2)
            .toArray()));


    System.out.println("\n ********* version3 **********");

    yemahhh.stream()
            .sorted(Comparator.comparing(t->t.charAt(t.length()-1)))
            .skip(2);
    System.out.println("\n ********* version4 **********");

}
    // Task : list elemanlarini son harfine göre siralayıp ilk iki eleman hariç kalan elemanlari print eden code create ediniz.


}
