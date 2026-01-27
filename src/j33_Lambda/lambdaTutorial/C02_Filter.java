package j33_Lambda.lambdaTutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_Filter {
    public static void main(String[] args) {
        List<Integer> sayiList = new ArrayList<>(Arrays.asList(7, 58, 17, 54, 33, 3, 13, 35, 65, 18, 61, 46, 25, 16, 6));

        System.out.println("   *** task01 ***   ");
        printCiftElStructured(sayiList); // 58 54 18 46 16 6
        System.out.println("\n   *** task02 ***   ");
        printCiftElFunctioned(sayiList); //58 54 18 46 16 6
        System.out.println("\n   *** task03 ***   ");
        print35tenKucukCift(sayiList);
        System.out.println("\n   *** task04 ***   ");
        print34tenBuyukyadaTek(sayiList); //7 58 17 54 33 3 13 35 65 61 46 25
    }//main sonu




    //Task01->"Structured Programming"--> AMELE Programming kullanarak  listin çift elemanlarını aynı satırda aralarında bosluk ile print ediniz
    private static void printCiftElStructured(List<Integer> sayiList) {
        for (int avuc:sayiList){
            if (avuc%2==0){
                System.out.print( avuc + " "); //58 54 18 46 16 6
            }
        }
    }

//task02-> "Functional Programming"--> CINCIX Programming kullanarak  listin çift elemanlarını aynı satırda aralarında bosluk ile print ediniz
private static void printCiftElFunctioned(List<Integer> sayiList) {
        sayiList.
                stream().
               // filter(t->t%2==0) //// if'in yaptigini yapar filter eder. akisataki her bir eleamni t ye atanip t nin cift olan elemanlari akisa devam edildi
                filter(SeedMethods::ciftMi) // seedmethods taki methodu call ederiz hic kod yazmadan ! istenilen best practice budur
                .forEach(SeedMethods::intYazdir); //58 54 18 46 16 6
}


//task03-> "Functional Programming"--> CINCIX Programming kullanarak  listin 35'den kucuk çift elemanlarını aynı satırda aralarında bosluk ile print ediniz
private static void print35tenKucukCift(List<Integer> sayiList) {
    sayiList.stream()
            .filter(SeedMethods::cift35Kck)
            .forEach(SeedMethods::intYazdir); //18 16 6
}

//task04-> "Functional Programming"--> CINCIX Programming kullanarak
// listin 34'den buyuk yada  tek elemanlarını aynı satırda aralarında bosluk ile print ediniz
private static void print34tenBuyukyadaTek(List<Integer> sayiList) {
    sayiList.stream()
          //  .filter(t->t>34 || t%2==1)
            .filter(SeedMethods::tekMi)
            .filter(SeedMethods::cift35Kck) // 3 ten buyuk seedmethod yap
            .forEach(SeedMethods::intYazdir); //7 58 17 54 33 3 13 35 65 61 46 25
}

}

