package j33_Lambda.lambdaTutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_Map {
    public static void main(String[] args) {
        List<Integer> sayiList = new ArrayList<>(Arrays.asList(7, 17, 3, 13, 35, 25, 16, 6));

        System.out.println("   *** task01 ***   ");
        ciftEKareAk(sayiList);
        System.out.println("\n   *** task02 ***   ");
        tekElKupAl(sayiList);
        System.out.println("\n   *** task03 ***   ");
        ciftKoklerinEl(sayiList);

    }//main sonu



    // Task01-> listin çift elemanlarının karelerini aynı satıra aralarına bosluk bırakarak print eden code create ediniz.
    private static void ciftEKareAk(List<Integer> sayiList) {
        sayiList
                .stream()
                .filter(SeedMethods::ciftMi)
                .map(SeedMethods::kareAl)
                .forEach(SeedMethods::intYazdir);




    }

    // Task02 : Functional Programming ile listin tek elemanlarinin  kuplerinin bir fazlasini ayni satirda aralarina bosluk birakarak print eden code create ediniz.

    private static void tekElKupAl(List<Integer> sayiList) {
        sayiList
                .stream()
                .filter(SeedMethods::tekMi)
                .map(SeedMethods::kupAl)
                .forEach(SeedMethods::intYazdir);




    }

    // Task03-> Functional Programming ile listin cift elemanlarinin   karekoklerini ayni satirda aralarina bosluk birakarak print eden code create ediniz.
    private static void ciftKoklerinEl(List<Integer> sayiList) {
        sayiList
                .stream()
                .filter(SeedMethods::ciftMi)
                .map(SeedMethods::karaKokAl)
                .forEach(SeedMethods::doubleYazdir);




    }

}
